-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2018 at 08:47 AM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `Client_ID` int(11) NOT NULL,
  `Client_firstname` varchar(45) DEFAULT NULL,
  `Client_lastname` varchar(45) DEFAULT NULL,
  `Client_phonenumber` varchar(11) DEFAULT NULL,
  `Client_password` varchar(45) DEFAULT NULL,
  `Client_email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`Client_ID`, `Client_firstname`, `Client_lastname`, `Client_phonenumber`, `Client_password`, `Client_email`) VALUES
(100, 'Sianwa', 'Atemi', '07099863096', '123456', 'sa.atemi@gmail.com'),
(101, 'Louise', 'Caitline', '07130899211', '3greenbottles', 'princesslouise@gmail.com'),
(102, 'Manka', 'Atemi', '0713081494', 'manak', 'saladfingers@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `Supervisor_ID` int(11) NOT NULL,
  `Property_ID` int(11) NOT NULL,
  `Comment_description` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `complaint`
--

CREATE TABLE `complaint` (
  `Client_ID` int(11) NOT NULL,
  `Supervisor_ID` int(11) DEFAULT NULL,
  `Complaint_description` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `contract`
--

CREATE TABLE `contract` (
  `Client_ID` int(11) NOT NULL,
  `Property_ID` int(11) DEFAULT NULL,
  `Rent_max` int(11) DEFAULT NULL,
  `Rent_paid` int(11) DEFAULT NULL,
  `Rent_arrears` int(11) DEFAULT NULL,
  `Supervisor_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contract`
--

INSERT INTO `contract` (`Client_ID`, `Property_ID`, `Rent_max`, `Rent_paid`, `Rent_arrears`, `Supervisor_ID`) VALUES
(100, 1, 10000, 10000, 0, 10);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `Location_ID` int(11) NOT NULL,
  `Location_address` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`Location_ID`, `Location_address`) VALUES
(123457, 'Madaraka'),
(123458, 'Siwaka'),
(123459, 'Kafoka');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `Manager_ID` int(11) NOT NULL,
  `Manager_name` varchar(45) DEFAULT NULL,
  `Manager_password` varchar(45) DEFAULT NULL,
  `Location_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`Manager_ID`, `Manager_name`, `Manager_password`, `Location_ID`) VALUES
(1000, 'Boss', 'Boss123', 123457);

-- --------------------------------------------------------

--
-- Table structure for table `property`
--

CREATE TABLE `property` (
  `Property_ID` int(11) NOT NULL,
  `Property_number` int(11) NOT NULL,
  `Property_type` varchar(45) NOT NULL,
  `Location_ID` int(11) NOT NULL,
  `Property_photo` longblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `property`
--

INSERT INTO `property` (`Property_ID`, `Property_number`, `Property_type`, `Location_ID`, `Property_photo`) VALUES
(1, 1, 'Flat', 123457, ''),
(2, 2, 'flat', 123457, ''),
(3, 3, 'flat', 123457, ''),
(4, 4, 'flat', 123457, ''),
(5, 5, 'flat', 123457, '');

-- --------------------------------------------------------

--
-- Table structure for table `supervisor`
--

CREATE TABLE `supervisor` (
  `Supervisor_ID` int(11) NOT NULL,
  `Supervisor_name` varchar(45) DEFAULT NULL,
  `Supervisor_password` varchar(45) DEFAULT NULL,
  `Supervisor_phonenumber` varchar(45) DEFAULT NULL,
  `Manager_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supervisor`
--

INSERT INTO `supervisor` (`Supervisor_ID`, `Supervisor_name`, `Supervisor_password`, `Supervisor_phonenumber`, `Manager_ID`) VALUES
(10, 'Mwala', 'mwala123', '0713123098', 0),
(11, 'Maseria', 'maseria123', '0722768536', 1),
(12, 'Buffon', 'buffon123', '0745890758', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`Client_ID`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`Supervisor_ID`,`Property_ID`);

--
-- Indexes for table `complaint`
--
ALTER TABLE `complaint`
  ADD PRIMARY KEY (`Client_ID`),
  ADD KEY `Supervisor_ID` (`Supervisor_ID`);

--
-- Indexes for table `contract`
--
ALTER TABLE `contract`
  ADD PRIMARY KEY (`Client_ID`),
  ADD KEY `Property_ID` (`Property_ID`),
  ADD KEY `Supervisor_ID` (`Supervisor_ID`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`Location_ID`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`Manager_ID`),
  ADD KEY `Location_ID` (`Location_ID`);

--
-- Indexes for table `property`
--
ALTER TABLE `property`
  ADD PRIMARY KEY (`Property_ID`),
  ADD KEY `Location_ID` (`Location_ID`);

--
-- Indexes for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`Supervisor_ID`),
  ADD KEY `Manager_ID` (`Manager_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `Client_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `Location_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123460;

--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `Manager_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1001;

--
-- AUTO_INCREMENT for table `property`
--
ALTER TABLE `property`
  MODIFY `Property_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `supervisor`
--
ALTER TABLE `supervisor`
  MODIFY `Supervisor_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `complaint`
--
ALTER TABLE `complaint`
  ADD CONSTRAINT `complaint_ibfk_1` FOREIGN KEY (`Supervisor_ID`) REFERENCES `supervisor` (`Supervisor_ID`),
  ADD CONSTRAINT `complaint_ibfk_2` FOREIGN KEY (`Client_ID`) REFERENCES `client` (`Client_ID`);

--
-- Constraints for table `contract`
--
ALTER TABLE `contract`
  ADD CONSTRAINT `contract_ibfk_1` FOREIGN KEY (`Property_ID`) REFERENCES `property` (`Property_ID`),
  ADD CONSTRAINT `contract_ibfk_2` FOREIGN KEY (`Client_ID`) REFERENCES `client` (`Client_ID`),
  ADD CONSTRAINT `contract_ibfk_3` FOREIGN KEY (`Supervisor_ID`) REFERENCES `supervisor` (`Supervisor_ID`);

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`Location_ID`) REFERENCES `location` (`Location_ID`);

--
-- Constraints for table `property`
--
ALTER TABLE `property`
  ADD CONSTRAINT `property_ibfk_1` FOREIGN KEY (`Location_ID`) REFERENCES `location` (`Location_ID`);

--
-- Constraints for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD CONSTRAINT `supervisor_ibfk_1` FOREIGN KEY (`Manager_ID`) REFERENCES `manager` (`Manager_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
