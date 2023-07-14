/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import MODEL.Gitar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import connection.ConnectionManager;

/**
 *
 * @author Win10
 */
public class GitarController {
    private String harga,stok;
    private String kode,nama,jenis;
    private ConnectionManager dbMgr;

    public GitarController(){
        this.dbMgr = new ConnectionManager();
    }
    
    
    public int saveMhs (String kode, String nama, String jenis, String harga){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Insert into tbl_gitar(kode, nama, jenis, harga)"
                + "values('" + kode + "','" +nama+ "','" +jenis+ "'," +harga+ ")";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(GitarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public List<Gitar> getAllMhs(){
        String query = "Select * from tbl_gitar";
        List<Gitar> allMhs = new ArrayList<Gitar>();
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                String kode = rs.getString("kode");
                String nama = rs.getString("nama");
                String jenis = rs.getString("jenis");
                String harga = rs.getString("harga");
                Gitar mhs = new Gitar(kode, nama, jenis, harga);
                allMhs.add(mhs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GitarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return allMhs;
    }
    
    public int delMhs(String kode){
        int hasil = 0;
        String query ="delete from tbl_gitar where kode = '"+ kode  + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(GitarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateMhs(String kode, String nama, String jenis, String harga){
        int hasil = 0;
        String query = "Update tbl_gitar set nama ='" + nama + "', jenis = '" +
                jenis + "', harga = '" + harga + "' where kode = '"+ kode + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(GitarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
}
