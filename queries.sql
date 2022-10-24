CREATE DATABASE practice_test;

CREATE TABLE practice_test.users (
	id INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(150) NOT NULL,
	last_name VARCHAR(150) NOT NULL,
	nationality VARCHAR (30) NOT NULL,
	age TINYINT	NOT NULL,
	email VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('GUSTAVO', 'GOMEZ', 'CHILEAN', 34, 'gustavo.gomez34@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('EDUARDO', 'RIVERA', 'MEXICAN', 27, 'eduardo.rivera@jhintersoftware.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('RICARDO', 'SOTO', 'CHILEAN', 41, 'ricardosoto23@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('VERONICA', 'MARTINEZ', 'CHILEAN', 35, 'veromartinezz@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('FELIPE', 'MELENDEZ', 'PERUVIAN', 32, 'hernanmelendez432@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('KARIN', 'ARIAS', 'CHILEAN', 25, 'kariarias@outlook.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('ANDRES', 'RUIZ', 'MEXICAN', 34, 'andres.ruizz@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('CILLIAN', 'MURPHY', 'IRISH', 46, 'cillianmurphy4040@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('NICOLAS', 'BARRA', 'CHILEAN', 21, 'jhon.snow@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('DIEGO', 'SCHWARTZMANN', 'ARGENTINIAN', 30, 'diegoschwatz@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('GUILLERMO', 'VERGARA', 'CHILEAN', 18, 'guillevergara20@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('KEVIN', 'ORTIZ', 'CHILEAN', 15, 'kevin.ortiz12@gmail.com');
INSERT INTO practice_test.users (first_name, last_name, nationality, age, email) VALUES ('PAULA', 'CISTENRAS', 'CHILEAN', 26, 'pauliicist@gmail.com');