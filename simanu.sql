-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 28, 2019 at 05:17 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `simanu`
--

-- --------------------------------------------------------

--
-- Table structure for table `diskdrive`
--

CREATE TABLE IF NOT EXISTS `diskdrive` (
  `id_dd` int(11) NOT NULL AUTO_INCREMENT,
  `kode_dd` varchar(10) NOT NULL,
  `nama_dd` varchar(50) NOT NULL,
  `merek_dd` varchar(20) NOT NULL,
  `harga_dd` int(11) NOT NULL,
  `stock_dd` int(11) NOT NULL,
  PRIMARY KEY (`id_dd`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `diskdrive`
--

INSERT INTO `diskdrive` (`id_dd`, `kode_dd`, `nama_dd`, `merek_dd`, `harga_dd`, `stock_dd`) VALUES
(5, 'DD0001', 'Seagate Baracuda 3.5 1 TB SATA', 'SEAGATE', 660000, 5);

-- --------------------------------------------------------

--
-- Table structure for table `dvdrom`
--

CREATE TABLE IF NOT EXISTS `dvdrom` (
  `id_dvdrom` int(11) NOT NULL AUTO_INCREMENT,
  `kode_dvdrom` varchar(10) NOT NULL,
  `nama_dvdrom` varchar(50) NOT NULL,
  `merek_dvdrom` varchar(20) NOT NULL,
  `harga_dvdrom` int(11) NOT NULL,
  `stock_dvdrom` int(11) NOT NULL,
  PRIMARY KEY (`id_dvdrom`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `dvdrom`
--

INSERT INTO `dvdrom` (`id_dvdrom`, `kode_dvdrom`, `nama_dvdrom`, `merek_dvdrom`, `harga_dvdrom`, `stock_dvdrom`) VALUES
(1, 'CD0001', 'LG DVD+RW SATA', 'LG', 190000, 15),
(2, 'CD0002', 'ASUS DVD+RW SATA DRW-24D5MT/B(OEM)', 'ASUS', 200000, 5),
(5, 'CD0003', 'ASUS SDRW- 08D2S-U LITE BLACK', 'ASUS', 320000, 12);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE IF NOT EXISTS `invoice` (
  `id_inv` int(11) NOT NULL AUTO_INCREMENT,
  `mb` varchar(50) NOT NULL,
  `ram` varchar(50) NOT NULL,
  `proc` varchar(50) NOT NULL,
  `Disk` varchar(50) NOT NULL,
  `vga` varchar(50) NOT NULL,
  `psu` varchar(50) NOT NULL,
  `mnt` varchar(50) NOT NULL,
  `dvd` varchar(50) NOT NULL,
  `kmc` varchar(50) NOT NULL,
  `grandTotal` int(11) NOT NULL,
  PRIMARY KEY (`id_inv`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id_inv`, `mb`, `ram`, `proc`, `Disk`, `vga`, `psu`, `mnt`, `dvd`, `kmc`, `grandTotal`) VALUES
(1, 'GIGABYTE H310M DS2', 'Apacer DDR4 Black Panther (Golden) Gaming 4Gb 2666', 'AMD FX-4300 Piledriver/ Vishera', 'Seagate Baracuda 3.5 1 TB SATA', 'MSI NVIDIA GeForce GT 710 2G', 'DAZUMBA 380W', 'ACER LED 18.5" EB162Q', 'LG DVD+RW SATA', 'DAZUMBA Keyboard+mouse logitech', 5884000);

-- --------------------------------------------------------

--
-- Table structure for table `keyboard`
--

CREATE TABLE IF NOT EXISTS `keyboard` (
  `id_kyb` int(11) NOT NULL AUTO_INCREMENT,
  `kode_kyb` varchar(10) NOT NULL,
  `nama_kyb` varchar(100) NOT NULL,
  `merek_kyb` varchar(20) NOT NULL,
  `harga_kyb` int(11) NOT NULL,
  `stock_kyb` int(11) NOT NULL,
  PRIMARY KEY (`id_kyb`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `keyboard`
--

INSERT INTO `keyboard` (`id_kyb`, `kode_kyb`, `nama_kyb`, `merek_kyb`, `harga_kyb`, `stock_kyb`) VALUES
(1, 'KYB001', 'Logitech Keyboard K200 USB Multimedia', 'LOGITECH', 150000, 5),
(3, 'KYB002', 'NYK Nemesis Gaming Keyboard Sacred K-02 Rainbow Black', 'NYK', 120000, 7),
(4, 'KYB003', 'Logitech keyboard K120', 'LOGITECH', 110000, 15),
(5, 'KYB004', 'Fantech keyboard gaming K611L Fighter', 'FANTECH', 170000, 3),
(6, 'KYB005', 'Fantech keyboard Gaming K611 TKL', 'FANTECH', 180000, 2),
(7, 'KYB006', 'Rexus Fortress K9 TKL Gaming Metal', 'REXUS', 180000, 10),
(8, 'KYB007', 'Rexus BattleFire K9SE Gaming', 'REXUS', 190000, 20),
(9, 'KYB008', 'NYK Nemesis Gaming Keyboard K-07 RGB LED', 'NYK', 230000, 1),
(10, 'KYB009', 'Logitech Wireless K270', 'LOGITECH', 285000, 33);

-- --------------------------------------------------------

--
-- Table structure for table `keymosecase`
--

CREATE TABLE IF NOT EXISTS `keymosecase` (
  `id_kmc` int(11) NOT NULL AUTO_INCREMENT,
  `nama_kmc` varchar(50) NOT NULL,
  `harga_kmc` int(11) NOT NULL,
  `stock_kmc` int(11) NOT NULL,
  PRIMARY KEY (`id_kmc`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `keymosecase`
--

INSERT INTO `keymosecase` (`id_kmc`, `nama_kmc`, `harga_kmc`, `stock_kmc`) VALUES
(1, 'POWERLOGIC Logitech keyboard+mouse combo', 520000, 5),
(2, 'DAZUMBA Keyboard+mouse logitech', 560000, 4),
(3, 'ARMAGEEDDON M1Z Logitech + Mouse Wirelless', 635000, 12);

-- --------------------------------------------------------

--
-- Table structure for table `merek`
--

CREATE TABLE IF NOT EXISTS `merek` (
  `id_merek` int(11) NOT NULL AUTO_INCREMENT,
  `nama_merek` varchar(20) NOT NULL,
  `kat_mb` int(11) NOT NULL,
  `kat_ram` int(11) NOT NULL,
  `kat_p` int(11) NOT NULL,
  `kat_dd` int(11) NOT NULL,
  `kat_vga` int(11) NOT NULL,
  `kat_psu` int(11) NOT NULL,
  `kat_mnt` int(11) NOT NULL,
  `kat_dvd` int(11) NOT NULL,
  `kat_kyb` int(11) NOT NULL,
  `kat_mou` int(11) NOT NULL,
  PRIMARY KEY (`id_merek`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `merek`
--

INSERT INTO `merek` (`id_merek`, `nama_merek`, `kat_mb`, `kat_ram`, `kat_p`, `kat_dd`, `kat_vga`, `kat_psu`, `kat_mnt`, `kat_dvd`, `kat_kyb`, `kat_mou`) VALUES
(1, 'GIGABYTE', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 'ASUS', 1, 0, 0, 0, 0, 0, 0, 1, 0, 0),
(3, 'MSI', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0),
(4, 'APACER', 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 'AMD', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
(6, 'INTEL PENTIUM', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
(7, 'SEAGATE', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
(8, 'Western Digital (WD)', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
(9, 'DAZUMBA', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
(10, 'ACER', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
(11, 'LG', 0, 0, 0, 0, 0, 0, 1, 1, 0, 0),
(12, 'LOGITECH', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
(13, 'NYK', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
(14, 'FANTECH', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
(15, 'REXUS', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
(16, 'GENIUS', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `monitor`
--

CREATE TABLE IF NOT EXISTS `monitor` (
  `id_mnt` int(11) NOT NULL AUTO_INCREMENT,
  `kode_mnt` varchar(10) NOT NULL,
  `nama_mnt` varchar(50) NOT NULL,
  `merek_mnt` varchar(20) NOT NULL,
  `harga_mnt` int(11) NOT NULL,
  `stock_mnt` int(11) NOT NULL,
  PRIMARY KEY (`id_mnt`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `monitor`
--

INSERT INTO `monitor` (`id_mnt`, `kode_mnt`, `nama_mnt`, `merek_mnt`, `harga_mnt`, `stock_mnt`) VALUES
(1, 'MNT001', 'ACER LED 18.5" EB162Q', 'ACER', 850000, 10),
(2, 'MNT002', 'ACER LED 24" ', 'ACER', 2500000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `motherboard`
--

CREATE TABLE IF NOT EXISTS `motherboard` (
  `id_mb` int(11) NOT NULL AUTO_INCREMENT,
  `kode_mb` varchar(6) NOT NULL,
  `nama_mb` varchar(30) NOT NULL,
  `merek` varchar(30) NOT NULL,
  `harga_mb` int(11) NOT NULL,
  `stock_mb` int(11) NOT NULL,
  PRIMARY KEY (`id_mb`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `motherboard`
--

INSERT INTO `motherboard` (`id_mb`, `kode_mb`, `nama_mb`, `merek`, `harga_mb`, `stock_mb`) VALUES
(8, 'MB0001', 'adada', 'GIGABYTE', 100000, 100000);

-- --------------------------------------------------------

--
-- Table structure for table `mouse`
--

CREATE TABLE IF NOT EXISTS `mouse` (
  `id_mou` int(11) NOT NULL AUTO_INCREMENT,
  `kode_mou` varchar(10) NOT NULL,
  `nama_mou` varchar(100) NOT NULL,
  `merek_mou` varchar(20) NOT NULL,
  `harga_mou` int(11) NOT NULL,
  `stock_mou` int(11) NOT NULL,
  PRIMARY KEY (`id_mou`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `mouse`
--

INSERT INTO `mouse` (`id_mou`, `kode_mou`, `nama_mou`, `merek_mou`, `harga_mou`, `stock_mou`) VALUES
(1, 'MOU001', 'Genius DX-110 PS/2', 'GENIUS', 50000, 56);

-- --------------------------------------------------------

--
-- Table structure for table `processor`
--

CREATE TABLE IF NOT EXISTS `processor` (
  `id_p` int(11) NOT NULL AUTO_INCREMENT,
  `kode_p` varchar(10) NOT NULL,
  `nama_p` varchar(50) NOT NULL,
  `merek_p` varchar(20) NOT NULL,
  `harga_p` int(11) NOT NULL,
  `stock_p` int(11) NOT NULL,
  PRIMARY KEY (`id_p`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `processor`
--

INSERT INTO `processor` (`id_p`, `kode_p`, `nama_p`, `merek_p`, `harga_p`, `stock_p`) VALUES
(5, 'PR0001', 'Core i3-4130', 'INTEL PENTIUM', 1550000, 10);

-- --------------------------------------------------------

--
-- Table structure for table `psu`
--

CREATE TABLE IF NOT EXISTS `psu` (
  `id_psu` int(11) NOT NULL AUTO_INCREMENT,
  `kode_psu` varchar(10) NOT NULL,
  `nama_psu` varchar(50) NOT NULL,
  `merek_psu` varchar(20) NOT NULL,
  `harga_psu` int(11) NOT NULL,
  `stock_psu` int(11) NOT NULL,
  PRIMARY KEY (`id_psu`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `psu`
--

INSERT INTO `psu` (`id_psu`, `kode_psu`, `nama_psu`, `merek_psu`, `harga_psu`, `stock_psu`) VALUES
(1, 'PSU001', 'DAZUMBA 380W', 'DAZUMBA', 240000, 4),
(2, 'PSU002', 'DAZUMBA 450 W', 'DAZUMBA', 250000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `ram`
--

CREATE TABLE IF NOT EXISTS `ram` (
  `id_ram` int(11) NOT NULL AUTO_INCREMENT,
  `kode_ram` varchar(10) NOT NULL,
  `nama_ram` varchar(50) NOT NULL,
  `merek_ram` varchar(10) NOT NULL,
  `harga_ram` int(11) NOT NULL,
  `stok_ram` int(11) NOT NULL,
  PRIMARY KEY (`id_ram`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `ram`
--

INSERT INTO `ram` (`id_ram`, `kode_ram`, `nama_ram`, `merek_ram`, `harga_ram`, `stok_ram`) VALUES
(5, 'RM0001', 'adadaada', 'APACER', 100000, 5),
(6, 'RM0002', 'adadada', 'APACER', 25000, 9);

-- --------------------------------------------------------

--
-- Table structure for table `vga`
--

CREATE TABLE IF NOT EXISTS `vga` (
  `id_vga` int(11) NOT NULL AUTO_INCREMENT,
  `kode_vga` varchar(10) NOT NULL,
  `nama_vga` varchar(50) NOT NULL,
  `merek_vga` varchar(20) NOT NULL,
  `harga_vga` int(11) NOT NULL,
  `stock_vga` int(11) NOT NULL,
  PRIMARY KEY (`id_vga`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `vga`
--

INSERT INTO `vga` (`id_vga`, `kode_vga`, `nama_vga`, `merek_vga`, `harga_vga`, `stock_vga`) VALUES
(1, 'VG0001', 'MSI NVIDIA GeForce GT 710 2G', 'MSI', 764000, 2),
(2, 'VG0002', 'MSI AMD Radeon R7 240 2', 'MSI', 670005, 10);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
