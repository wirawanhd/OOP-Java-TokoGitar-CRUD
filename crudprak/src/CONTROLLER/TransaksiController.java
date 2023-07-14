/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import connection.ConnectionManager;

/**
 *
 * @author Win10
 */
public class TransaksiController {
     private String harga,stok;
    private String kode,nama,jenis;
    private ConnectionManager dbMgr;

    public TransaksiController(){
        this.dbMgr = new ConnectionManager();
    }
    
    
    public int saveMhs ( String nama_pembeli, String kode){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Insert into tbl_transaksi(nama_pembeli, kode)"
                + "values('" +nama_pembeli+ "','" +kode+ "')";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(GitarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
   
    public int delMhs(int kodetransaksi){
        int hasil = 0;
        String query ="delete from tbl_transaksi where kodetransaksi = '"+ kodetransaksi  + "'";
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
}
