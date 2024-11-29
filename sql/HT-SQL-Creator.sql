CREATE DATABASE HealthTrackDB;
USE HealthTrackDB;

CREATE TABLE Professional (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    user VARCHAR(10) NOT NULL,
    password VARCHAR(10) NOT NULL,
    type VARCHAR(50) NOT NULL,
    phone VARCHAR(50),
    email VARCHAR(50),
    birthDate DATE,
	registerType VARCHAR(20),
    registerNumber VARCHAR(20),
    specialty VARCHAR(100),
    status VARCHAR(15),
    permissions VARCHAR(10)
);

CREATE TABLE Patient (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    socialName VARCHAR(50) NOT NULL,
	birthDate DATE NOT NULL,
    nationality VARCHAR(50) NOT NULL,
    naturalness VARCHAR(50),
    race VARCHAR(10),
    sex VARCHAR(10) NOT NULL,
    cpf VARCHAR(15),
    mother VARCHAR(50) NOT NULL,
    father VARCHAR(50),
    guardian VARCHAR(50),
    phone1 VARCHAR(20) NOT NULL,
    phone2 VARCHAR(20),
    email VARCHAR(50),
    emergencyPhone VARCHAR(20),
    emergencyName VARCHAR(50),
    emergencyRelation VARCHAR(15),
    adress VARCHAR(100) NOT NULL,
    status VARCHAR(15) DEFAULT "Sem prontuário"
);

CREATE TABLE MedicalRecord (
	id INT AUTO_INCREMENT PRIMARY KEY,
	patientId INT NOT NULL,
    bloodType VARCHAR(10),
    weight DOUBLE,
	height DOUBLE,
    allergies VARCHAR(255),
    medications VARCHAR(255),
	diseases VARCHAR(255),
	diseasesHistory VARCHAR(255),
	familyHistory VARCHAR(255),
	surgeryHistory VARCHAR(255),
	observations VARCHAR(255),
	status VARCHAR(15) DEFAULT "Ativo",
    
	FOREIGN KEY (patientId) REFERENCES Patient(id) ON DELETE CASCADE
);

CREATE TABLE Attachment (
	id INT AUTO_INCREMENT PRIMARY KEY,
	professionalId INT,
    title VARCHAR(100) NOT NULL,
    path VARCHAR(255) NOT NULL,
    date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    
    FOREIGN KEY (professionalId) REFERENCES Professional(id) ON DELETE SET NULL
);

CREATE TABLE Appointment (
	id INT AUTO_INCREMENT PRIMARY KEY,
    patientId INT NOT NULL,
	professionalId INT NOT NULL,
	schedulerId INT,
    speciality VARCHAR(50) NOT NULL,
    reason VARCHAR(100) NOT NULL,
    type VARCHAR(255) NOT NULL,
    date DATETIME NOT NULL,
	status VARCHAR(20) NOT NULL,
    appoitmentValue FLOAT NOT NULL,
	paymentMethod VARCHAR(20) NOT NULL,
    additionalData VARCHAR(255) NOT NULL,
    
	/*FOREIGN KEY (patientId) REFERENCES Patient(id) ON DELETE CASCADE,*/
	FOREIGN KEY (professionalId) REFERENCES Professional(id) ON DELETE CASCADE,
	FOREIGN KEY (schedulerId) REFERENCES Professional(id) ON DELETE SET NULL
);

CREATE TABLE Service (
	id INT AUTO_INCREMENT PRIMARY KEY,
    appointmentId INT,
    procedureDesc VARCHAR(255) NOT NULL,
    symptoms VARCHAR(255) NOT NULL,
    diagnosis VARCHAR(100) NOT NULL,
    treatment VARCHAR(255) NOT NULL,
    additionalData VARCHAR(255) NOT NULL,
    
	FOREIGN KEY (appointmentId) REFERENCES Appointment(id) ON DELETE SET NULL
);

CREATE TABLE Exam (
	id INT AUTO_INCREMENT PRIMARY KEY,
    serviceId INT,
    patientId INT,
    professionalId INT,
    description VARCHAR(255) NOT NULL,
    reason VARCHAR(150) NOT NULL,
	date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
    
	/*FOREIGN KEY (serviceId) REFERENCES Service(id) ON DELETE CASCADE,
	FOREIGN KEY (patientId) REFERENCES Patient(id) ON DELETE CASCADE,
	FOREIGN KEY (professionalId) REFERENCES Professional(id) ON DELETE CASCADE*/
);

CREATE TABLE Recipe (
	id INT AUTO_INCREMENT PRIMARY KEY,
	serviceId INT NOT NULL,
    patientId INT NOT NULL,
    professionalId INT NOT NULL,
    description VARCHAR(255) NOT NULL,
	date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
    
	/*FOREIGN KEY (serviceId) REFERENCES Service(id) ON DELETE CASCADE,
	FOREIGN KEY (patientId) REFERENCES Patient(id) ON DELETE CASCADE,
	FOREIGN KEY (professionalId) REFERENCES Professional(id) ON DELETE CASCADE*/
);

CREATE TABLE Referral (
	id INT AUTO_INCREMENT PRIMARY KEY,
	serviceId INT NOT NULL,
    patientId INT NOT NULL,
    professionalId INT NOT NULL,
    description VARCHAR(255) NOT NULL,
    reason VARCHAR(150) NOT NULL,
	date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
    
	/*FOREIGN KEY (serviceId) REFERENCES Service(id) ON DELETE CASCADE,
	FOREIGN KEY (patientId) REFERENCES Patient(id) ON DELETE CASCADE,
	FOREIGN KEY (professionalId) REFERENCES Professional(id) ON DELETE CASCADE*/
);

/* 	
	1. Exam - 11 : description / 12 : reason
	2. Recipe - 21 : description
    3. Referral - 31 : description / 32 : reason
*/	
CREATE TABLE PredefinedText (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    type INT NOT NULL,		
    text VARCHAR(255) NOT NULL
);