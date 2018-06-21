/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 5.5.56 : Database - library_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library_management` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `library_management`;

/*Table structure for table `book_details` */

DROP TABLE IF EXISTS `book_details`;

CREATE TABLE `book_details` (
  `unique_code` varchar(30) NOT NULL,
  `book_name` varchar(30) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `publisher` varchar(30) DEFAULT NULL,
  `edition` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`unique_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `book_details` */

insert  into `book_details`(`unique_code`,`book_name`,`author`,`publisher`,`edition`) values 
('2312','java','suraj','ronak','5'),
('837483','KJSLCK','SKCLS','JSOCL;KS','3');

/*Table structure for table `issue_book` */

DROP TABLE IF EXISTS `issue_book`;

CREATE TABLE `issue_book` (
  `unique_code` varchar(30) DEFAULT NULL,
  `student_id` varchar(30) DEFAULT NULL,
  `student_name` varchar(30) DEFAULT NULL,
  `issue_date` varchar(20) DEFAULT NULL,
  `due_date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `issue_book` */

/*Table structure for table `librarian` */

DROP TABLE IF EXISTS `librarian`;

CREATE TABLE `librarian` (
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `contact_no` varchar(15) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `DOJ` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `librarian` */

insert  into `librarian`(`name`,`password`,`email`,`contact_no`,`gender`,`address`,`DOJ`) values 
('RONAK','2312','ronakpansari@gmail.com','967280079','Female','jecrc gh','23/12/2014'),
('golu','0596','golu@gmail.com','7568665369','Female','jecrc gh','7/10/2010'),
('skfldl','fskdc','sldks;','dosk','Male','doks;ldx','1/2/2011'),
(';o;vkd;','e;dlfkd','ledkm','feldkjs','Male',';dkjods','1/1/2010');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `login_id` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`login_id`,`password`) values 
('Admin','2312'),
('Librarian','8976');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
