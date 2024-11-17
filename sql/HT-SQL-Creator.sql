CREATE DATABASE HealthTrackDB;
USE HealthTrackDB;

CREATE TABLE Patient (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE Professional (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE Attachment (
	id INT AUTO_INCREMENT PRIMARY KEY,
	professionalId INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    path VARCHAR(255) NOT NULL,
    date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    
    FOREIGN KEY (professionalId) REFERENCES Professional(id) ON DELETE SET NULL
);

CREATE TABLE Appointment (
	id INT AUTO_INCREMENT PRIMARY KEY,
    patientId INT NOT NULL,
	professionalId INT NOT NULL,
	schedulerId INT NOT NULL,
    speciality VARCHAR(50) NOT NULL,
    reason VARCHAR(100) NOT NULL,
    type VARCHAR(255) NOT NULL,
    date DATETIME NOT NULL,
	status VARCHAR(20) NOT NULL,
    appoitmentValue FLOAT NOT NULL,
	paymentMethod VARCHAR(20) NOT NULL,
    additionalData VARCHAR(255) NOT NULL,
    
	FOREIGN KEY (patientId) REFERENCES Patient(id) ON DELETE CASCADE,
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
    name VARCHAR(100) NOT NULL
);

CREATE TABLE Service_Exam (
	serviceId INT NOT NULL,
    examId INT NOT NULL,
    description VARCHAR(200) NOT NULL,
    reason VARCHAR(100) NOT NULL,
    
    PRIMARY KEY (serviceId, examId),
    FOREIGN KEY (serviceId) REFERENCES Service(id) ON DELETE CASCADE,
    FOREIGN KEY (examId) REFERENCES Exam(id) ON DELETE CASCADE
);

CREATE TABLE Recipe (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE Service_Recipe (
	serviceId INT NOT NULL,
    recipeId INT NOT NULL,
    description VARCHAR(255) NOT NULL,
    
    PRIMARY KEY (serviceId, recipeId),
    FOREIGN KEY (serviceId) REFERENCES Service(id) ON DELETE CASCADE,
    FOREIGN KEY (recipeId) REFERENCES Recipe(id) ON DELETE CASCADE
);

CREATE TABLE Referral (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE Service_Referral (
	serviceId INT NOT NULL,
    referralId INT NOT NULL,
    description VARCHAR(200) NOT NULL,
    reason VARCHAR(100) NOT NULL,
    
    PRIMARY KEY (serviceId, referralId),
    FOREIGN KEY (serviceId) REFERENCES Service(id) ON DELETE CASCADE,
    FOREIGN KEY (referralId) REFERENCES Referral(id) ON DELETE CASCADE
);