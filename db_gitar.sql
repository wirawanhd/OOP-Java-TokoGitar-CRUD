-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jun 2022 pada 18.48
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_gitar`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_gitar`
--

CREATE TABLE `tbl_gitar` (
  `kode` varchar(5) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_gitar`
--

INSERT INTO `tbl_gitar` (`kode`, `nama`, `jenis`, `harga`) VALUES
('AA001', 'Yamaha F310', 'Akustik', '1300000'),
('AA002', 'Ibanez AZES40', 'Elektrik', '4600000'),
('AA003', 'Ibanez Adam Jones', 'Elektrik', '23000000'),
('AA004', 'Yamaha Pacifica', 'Elektrik', '6000000'),
('AA005', 'Ibanez Gio', 'Elektrik', '40000000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `kodetransaksi` int(5) NOT NULL,
  `nama_pembeli` varchar(20) NOT NULL,
  `kode` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`kodetransaksi`, `nama_pembeli`, `kode`) VALUES
(26, 'wirawann', 'AA003'),
(27, 'wirawan', 'AA004');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_gitar`
--
ALTER TABLE `tbl_gitar`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`kodetransaksi`),
  ADD KEY `kode` (`kode`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  MODIFY `kodetransaksi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD CONSTRAINT `tbl_transaksi_ibfk_1` FOREIGN KEY (`kode`) REFERENCES `tbl_gitar` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
