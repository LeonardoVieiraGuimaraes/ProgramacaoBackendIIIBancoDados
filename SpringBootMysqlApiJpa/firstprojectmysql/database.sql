CREATE DATABASE firstprojectmysql;
use firstprojectmysql;
CREATE TABLE Discipl (
    id INT AUTO_INCREMENT,
    name VARCHAR(255),
    teacher VARCHAR(255),
    dateStart DATE,
    dateEnd DATE,
    hours INT,
    grade INT,
    PRIMARY KEY (id)
);