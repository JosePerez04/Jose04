<?php include("conexion.php"); ?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>CRUD de Clientes</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <h1>📋 Lista de Clientes</h1>
    <a href="crear.php" class="btn btn-success">➕ Agregar Cliente</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Correo</th>
            <th>Acciones</th>
        </tr>
        <?php
        $sql = "SELECT * FROM clientes";
        $result = $conn->query($sql);
        while($row = $result->fetch_assoc()) {
            echo "<tr>
                    <td>".$row['id']."</td>
                    <td>".$row['nombre']."</td>
                    <td>".$row['correo']."</td>
                    <td>
                        <a class='btn btn-primary' href='editar.php?id=".$row['id']."'>✏️ Editar</a>
                        <a class='btn btn-danger' href='eliminar.php?id=".$row['id']."' onclick='return confirm(\"¿Seguro de eliminar?\")'>🗑 Eliminar</a>
                    </td>
                </tr>";
        }
        ?>
    </table>
</div>

</body>
</html>
