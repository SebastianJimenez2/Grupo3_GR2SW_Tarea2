<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            background-image: url('https://i.pinimg.com/originals/54/43/1f/54431f0022c01fa4f746f7ccc0db8f3f.jpg'); /* Reemplaza 'ruta/a/tu/imagen.jpg' con la ruta real de tu imagen */
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        form {
            margin: 20px;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #f7f7f7;
            max-width: 400px;
        }

        input[type="text"], textarea {
            width: 94%;
            padding: 10px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
<form action="/guardar-empleado" method="post">
    <h2>Formulario de Empleados</h2>

    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" placeholder="Ingrese su nombre">

    <label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" placeholder="Ingrese su apellido">

    <label for="edad">Edad:</label>
    <input type="text" id="edad" name="edad" placeholder="Ingrese su edad">

    <input type="submit" value="Enviar">
</form>
</body>
</html>
