CREATE DATABASE IF NOT EXISTS mi_base_de_datos;
USE mi_base_de_datos;


CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    gmail VARCHAR(100) NOT NULL UNIQUE,
    ciudad VARCHAR(50),
    direccion VARCHAR(100),
    telefono VARCHAR(20)
);


CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    clave VARCHAR(255) NOT NULL
);
