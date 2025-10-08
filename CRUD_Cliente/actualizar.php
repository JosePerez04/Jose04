<?php
include("conexion.php");

$id = $_POST['id'];
$nombre = $_POST['nombre'];
$correo = $_POST['correo'];

$sql = "UPDATE clientes SET nombre='$nombre', correo='$correo' WHERE id=$id";

if ($conn->query($sql) === TRUE) {
    header("Location: index.php");
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
?>
