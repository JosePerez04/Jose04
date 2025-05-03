CREATE DATABASE IF NOT EXISTS sistema_usuarios;
USE sistema_usuarios;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    gmail VARCHAR(100) NOT NULL UNIQUE,
    username VARCHAR(50) NOT NULL UNIQUE,
    clave VARCHAR(255) NOT NULL
);

INSERT INTO usuarios (nombre, gmail, username, clave)
VALUES ('José', 'jose@gmail.com', 'jose1', '123');
