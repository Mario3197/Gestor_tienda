<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>
<html>
    <head>
        <title>Menú principal</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    </head>
    <body>
        <div class="row h-100 justify-content-center align-items-center">
            <div class="col-6 align-self-center">
                <div class="card">
                    <div class="card-header text-white text-center" style="background-color: #1178D6;">
                       <h1> INICIO </h1>
                    </div>
                    <div class="d-flex justify-content-end">
                        <a href="/" style="text-decoration:none; margin-right: 2%; color: inherit;">
                            <h4><i class="fas fa-sign-out-alt"></i> Cerrar sesión</h4>
                        </a>
                    </div>
                    <div class="card-body">
                        <div class="container">
                            <div class="row justify-content-between">
                                <div class="col-4">
                                    <h1 style="font-size: 100px; margin-left: 40%"><i class="fas fa-user"></i></h1>
                                </div>
                                <div class="col-6">
                                    <h2 style="text-align: right;">Número de usuario: ${usuario.id}</h2>
                                    <div class ="d-flex justify-content-between" style="margin-top: 10%;">
                                        <a href="cliente?accion=actualizar-usuario&idUsuario=${usuario.id}" class="btn btn-primary">
                                            <i class="fas fa-pen"></i> Editar
                                        </a>
                                        <a href="#" class="btn btn-primary">
                                            <i class="fas fa-eye"></i> Ver pedidos
                                        </a>
                                    </div>
                                </div>
                            </div>

                            <div class="row" style="margin-top: 2%">
                                <div class="col-6">
                                    <h4> ${usuario.nombre} </h4>
                                    <h4> ${usuario.correo} </h4>
                                    <h4> ${usuario.direccion} </h4>
                                    <h4> ${usuario.usuario} </h4>
                                    <h4> ${usuario.password} </h4>
                                </div>
                                <div class="col-6" style="margin-top: 8%">
                                    <div class="card text-center text-white bg-success mb-3">
                                        <div class="card-body">
                                            <h3 class="card-title">Monto a pagar</h3>
                                            <h4> <fmt:formatNumber value="${totalPedidos}" type="currency"/></h4>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row" style="margin-top: 5%">
                                <div class="col-12">
                                    <a href="pedido?idUsuario=${usuario.id}" class="btn btn-primary">
                                        <h4><i class="fas fa-truck-loading"></i> Nuevo pedido</h4>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
