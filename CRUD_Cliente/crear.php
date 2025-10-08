<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Agregar Cliente</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <h2>➕ Registrar Cliente</h2>
    <form action="crear.php" method="POST">
        <label>Nombre:</label>
        <input type="text" name="nombre" required>

        <label>Correo:</label>
        <input type="email" name="correo" required>

        <button type="submit" class="btn btn-success">Guardar</button>
        <a href="index.php" class="btn btn-secondary">Cancelar</a>
    </form>
</div>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    include("conexion.php");
    $nombre = $_POST['nombre'];
    $correo = $_POST['correo'];
    $sql = "INSERT INTO clientes (nombre, correo) VALUES ('$nombre', '$correo')";
    if ($conn->query($sql) === TRUE) {
        header("Location: index.php");
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}
?>
</body>
</html>
