<?php
$servername = "localhost";
$username = "root";   
$password = "J@seD@vid240421";       
$dbname = "crud_db";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}
?>

