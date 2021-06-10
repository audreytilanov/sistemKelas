-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 09, 2021 at 07:55 PM
-- Server version: 5.7.21
-- PHP Version: 7.1.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_login`
--

-- --------------------------------------------------------

--
-- Table structure for table `absen_siswa`
--

DROP TABLE IF EXISTS `absen_siswa`;
CREATE TABLE IF NOT EXISTS `absen_siswa` (
  `id_absen` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `tgl` date NOT NULL,
  PRIMARY KEY (`id_absen`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `absen_siswa`
--

INSERT INTO `absen_siswa` (`id_absen`, `id_user`, `tgl`) VALUES
(1, 1, '2021-06-09'),
(2, 1, '2021-06-10');

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

DROP TABLE IF EXISTS `guru`;
CREATE TABLE IF NOT EXISTS `guru` (
  `id_guru` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `akses` int(11) DEFAULT NULL,
  `nama_lengkap` varchar(50) DEFAULT NULL,
  `jabatan` varchar(50) DEFAULT NULL,
  `no_telp` varchar(16) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_guru`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`id_guru`, `username`, `password`, `akses`, `nama_lengkap`, `jabatan`, `no_telp`, `alamat`) VALUES
(1, 'buna', 'buna', 2, 'buna', 'sekre', '2132132', 'dede'),
(2, 'rere', 'rere', 2, NULL, NULL, NULL, NULL),
(3, 'ti', 'ti', 2, NULL, NULL, NULL, NULL),
(4, 'admin', 'admin', 3, 'admin', 'admin', '213183', 'Denpasara');

-- --------------------------------------------------------

--
-- Table structure for table `pengerjaan_tugas`
--

DROP TABLE IF EXISTS `pengerjaan_tugas`;
CREATE TABLE IF NOT EXISTS `pengerjaan_tugas` (
  `id_pengerjaan` int(11) NOT NULL AUTO_INCREMENT,
  `id_tugas` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `tgl_dikumpul` date NOT NULL,
  `isi` text NOT NULL,
  PRIMARY KEY (`id_pengerjaan`)
) ENGINE=InnoDB AUTO_INCREMENT=322 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengerjaan_tugas`
--

INSERT INTO `pengerjaan_tugas` (`id_pengerjaan`, `id_tugas`, `id_user`, `tgl_dikumpul`, `isi`) VALUES
(1, 1, 1, '2021-06-09', ''),
(321, 1, 1, '2021-03-03', 'dasdasda');

-- --------------------------------------------------------

--
-- Table structure for table `tugas`
--

DROP TABLE IF EXISTS `tugas`;
CREATE TABLE IF NOT EXISTS `tugas` (
  `id_tugas` int(11) NOT NULL AUTO_INCREMENT,
  `id_guru` int(11) NOT NULL,
  `nama_tugas` varchar(50) NOT NULL,
  `tgl_berakhir` date NOT NULL,
  `kelas` int(11) NOT NULL,
  PRIMARY KEY (`id_tugas`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tugas`
--

INSERT INTO `tugas` (`id_tugas`, `id_guru`, `nama_tugas`, `tgl_berakhir`, `kelas`) VALUES
(1, 1, 'Essay', '2021-06-09', 0),
(2, 1, 'asd', '2021-03-01', 12);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `akses` int(11) DEFAULT NULL,
  `nama_lengkap` varchar(100) DEFAULT NULL,
  `kelas` varchar(50) DEFAULT NULL,
  `no_telp` varchar(16) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=20056 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `akses`, `nama_lengkap`, `kelas`, `no_telp`, `alamat`) VALUES
(1, 'audrey', 'audrey', 1, 'Audrey Tilanov Pramasa', '12', '082144928293', 'Denpasar'),
(2, 'andre', 'andre', 1, 'Andrean Muhammad', '21', '3132132', ''),
(10, 'test', 'test', 1, '12', '21', '21321', 'des'),
(12, 'unud', 'unud', 1, 'Universitas Udayana', '12', '03128312312', 'Jimbaran'),
(13, 'weq', '123', 1, NULL, NULL, NULL, NULL),
(14, 'admin1', 'admin1', 1, 'admin1', '12', '12334444', 'gianyar'),
(15, 'teknik', 'teknik', 1, 'Fk teknik', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
