DROP DATABASE IF EXISTS  `Testing_System_1` ; 
CREATE DATABASE `Testing_System_1`; 
USE `Testing_System_1`; 

DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department`(
	DepartmentID TINYINT UNSIGNED PRIMARY KEY,
    DepartmentName VARCHAR(50) UNIQUE KEY NOT NULL 
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position`(
	PositionID INT AUTO_INCREMENT,
    PositionName VARCHAR(50)
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	AccountID INT UNSIGNED,
    Email VARCHAR(50),
    Username VARCHAR(50),
    FullName CHAR(50),
    DepartmentID TINYINT UNSIGNED, 
    PositionID INT UNSIGNED, 
    CreateDate DATE,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	GroupID	INT UNSIGNED,
 	GroupName VARCHAR(50),
 	CreatorID INT UNSIGNED,
	CreateDate DATE
);

DROP TABLE IF EXISTS `GroupAccount`;
CREATE TABLE `GroupAccount`(
	GroupID	INT UNSIGNED,
 	AccountID INT UNSIGNED,
    JoinDate DATE
);

DROP TABLE IF EXISTS `TypeQuestion`;
CREATE TABLE `TypeQuestion`(
	TypeID INT UNSIGNED, 
    TypeName ENUM('Essay','Multiple-Choice')
);

DROP TABLE IF EXISTS `CategoryQuestion`;
CREATE TABLE `CategoryQuestion`(
	CategoryID INT UNSIGNED,
 	CategoryName VARCHAR(50)
);

DROP TABLE IF EXISTS `Question`;
CREATE TABLE `Question`(
	QuestionID INT UNSIGNED AUTO_INCREMENT,
	Content VARCHAR(50),
 	CategoryID INT UNSIGNED,
 	TypeID INT UNSIGNED,
 	CreatorID INT UNSIGNED,
	CreateDate DATE
);

DROP TABLE IF EXISTS `Answer`;
CREATE TABLE `Answer`(
	AnswerID INT UNSIGNED ,
	Content VARCHAR(50),
	QuestionID INT UNSIGNED,
	isCorrect BIT
);

DROP TABLE IF EXISTS `Exam`;
CREATE TABLE `Exam`(
	ExamID INT UNSIGNED,
	Code VARCHAR(50),
	Title VARCHAR(50),
	CategoryID INT,
	Duration INT UNSIGNED,
	CreatorID INT UNSIGNED,
	CreateDate DATE
);

DROP TABLE IF EXISTS `ExamQuestion`;
CREATE TABLE `ExamQuestion`(
	ExamID INT UNSIGNED, 
	QuestionID INT UNSIGNED
);














