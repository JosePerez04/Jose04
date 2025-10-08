<?php
include("conexion.php");
$id = $_GET['id'];
$sql = "SELECT * FROM clientes WHERE id=$id";
$result = $conn->query($sql);
$row = $result->fetch_assoc();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Cliente</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <h2>✏️ Editar Cliente</h2>
    <form action="actualizar.php" method="POST">
        <input type="hidden" name="id" value="<?php echo $row['id']; ?>">

        <label>Nombre:</label>
        <input type="text" name="nombre" value="<?php echo $row['nombre']; ?>" required>

        <label>Correo:</label>
        <input type="email" name="correo" value="<?php echo $row['correo']; ?>" required>

        <button type="submit" class="btn btn-success">💾 Guardar cambios</button>
        <a href="index.php" class="btn btn-secondary">Cancelar</a>
    </form>
</div>

</body>
</html>
