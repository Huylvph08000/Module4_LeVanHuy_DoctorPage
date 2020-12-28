drop database if exists doctor;
CREATE DATABASE DOCTOR;
USE DOCTOR;

CREATE TABLE Doctors
(
    doctor_id   INT(10)      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    doctor_name VARCHAR(45)  NOT NULL,
    sex         ENUM ('Nam', 'Nữ'),
    nationality VARCHAR(45)  NOT NULL,
    adress      VARCHAR(100) DEFAULT 'xxx',
    phonenumber VARCHAR(20)  DEFAULT '+84xxx',
    work   VARCHAR(100) NOT NULL,
    major_name       VARCHAR(255) NOT NULL,
    title       VARCHAR(255) NOT NULL,
    hospital_name    VARCHAR(500) NOT NULL
);
CREATE TABLE Doctor_infor
(
        doctor_infor_id   INT(10)     NOT NULL PRIMARY KEY AUTO_INCREMENT,
        doctor_avartar VARCHAR(1024) default 'url',
		`work`   VARCHAR(100) NOT NULL,
        doctor_name VARCHAR(45)  NOT NULL,
        adress      VARCHAR(100) DEFAULT 'xxx',
        phonenumber VARCHAR(20)  DEFAULT '+84xxx',
        major_name       VARCHAR(255) NOT NULL,
        hospital_name VARCHAR(500) NOT NULL,
        work_experience VARCHAR(1000),
        doctor_discrible VARCHAR(1000),
        doctor_award VARCHAR(1000)
);
CREATE TABLE Hospital
(
    hospital_name_id   INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    hospital_name VARCHAR(500) NOT NULL
);
CREATE TABLE Nationality
(
    nationality_id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nationality_name VARCHAR(50) NOT NULL
);
CREATE TABLE Major
(
    major_name_id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    major_name VARCHAR(50) NOT NULL
);

select * from Doctors;