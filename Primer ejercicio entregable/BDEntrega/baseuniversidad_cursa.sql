-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: baseuniversidad
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cursa`
--

DROP TABLE IF EXISTS `cursa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursa` (
  `idCarrera` int NOT NULL,
  `dni` int NOT NULL,
  `egresado` bit(1) NOT NULL,
  `fechaInscripcion` date DEFAULT NULL,
  PRIMARY KEY (`idCarrera`,`dni`),
  KEY `FKkq8wjtcoyp15rebocst1wxgmu` (`dni`),
  CONSTRAINT `FKkq8wjtcoyp15rebocst1wxgmu` FOREIGN KEY (`dni`) REFERENCES `estudiante` (`dni`),
  CONSTRAINT `FKq69p8hnjm7pf4op6iwn5nioyq` FOREIGN KEY (`idCarrera`) REFERENCES `carrera` (`idCarrera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursa`
--

LOCK TABLES `cursa` WRITE;
/*!40000 ALTER TABLE `cursa` DISABLE KEYS */;
INSERT INTO `cursa` VALUES (1,12345678,_binary '\0','2020-02-15'),(1,12345679,_binary '','2018-07-12'),(1,44455566,_binary '\0','2021-11-10'),(1,55566677,_binary '','2022-08-05'),(1,77788899,_binary '','2020-05-11'),(1,88899900,_binary '\0','2022-11-15'),(1,98765432,_binary '\0','2022-05-20'),(2,11122233,_binary '','2019-09-30'),(2,12345678,_binary '','2023-01-15'),(2,22233344,_binary '\0','2020-06-25'),(2,44455566,_binary '\0','2022-09-08'),(2,55566677,_binary '','2021-04-05'),(2,87654321,_binary '\0','2021-03-01'),(2,98765432,_binary '\0','2021-03-30'),(3,11122233,_binary '','2023-04-22'),(3,12345679,_binary '','2018-08-10'),(3,22233344,_binary '\0','2023-08-27'),(3,77788899,_binary '','2019-10-15'),(3,87654321,_binary '\0','2020-02-18'),(3,88899900,_binary '\0','2021-12-30');
/*!40000 ALTER TABLE `cursa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-25 22:40:39
