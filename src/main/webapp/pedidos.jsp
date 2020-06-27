<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>Nuevo pedido</title>
        <link rel="icon" type="image/x-icon" href="favicon.ico"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    </head>
    <body>
        <div class="row h-100 justify-content-center align-items-center">
            <div class="col-6 align-self-center">
                <div class="card">
                    <jsp:include page="WEB-INF/componentesGenerales/accionesGenerales.jsp"/>
                    <div class="card-body">
                        <div class="container">
                            <div class="row">
                                <div class="col align-self-center">
                                    <h1 style="text-align: center">
                                        <i class="fas fa-truck-loading"></i> PEDIDOS TOTALES
                                    </h1>
                                </div>
                            </div>
                            <form action="pedido?accion=crear" method="POST" class="was-validated">
                                <div class="row justify-content-end" style="margin-top: 2%">
                                    <div class="col-4">
                                        # Pedido
                                    </div>
                                    <div class="col">
                                        Editar
                                    </div>
                                    <div class="col">
                                        Eliminar
                                    </div>
                                    <div class="col-4">
                                        Monto
                                    </div>
                                </div>
                                <c:forEach items="${pedidos}" var="pedido">
                                    <div class="row" style="margin-top: 2%">
                                        <div class="col-4">
                                            <input type="number" class="form-control" value ="${pedido.id}" autocomplete="off" readonly required/>
                                        </div>
                                        <div class="col text-white">
                                            <a class="btn btn-primary">
                                                <h4><i class="fas fa-edit"></i></h4>
                                            </a>
                                        </div>
                                        <div class="col text-white">
                                            <a href="pedido?accion=borrar&idUsuario=${idUsuario}&idPedido=${pedido.id}" class="btn btn-danger">
                                                <h4><i class="fas fa-trash-alt"></i></h4>
                                            </a>
                                        </div>
                                        <div class="col-4">
                                            <input type="number" class="form-control" value ="${pedido.total}" autocomplete="off" readonly required/>
                                        </div>
                                    </div>
                                </c:forEach>
                                <div class="row" style="margin-top: 2%">
                                    <div class="card" style="width: 100%">
                                        <div class="card-body" style="text-align: right">
                                            <h3 class="card-title">Total a pagar</h3>
                                            <h1 class="d-flex justify-content-between">
                                                <i class="fas fa-money-bill"></i>
                                                $ ${totalPedidos}
                                            </h1>
                                        </div>
                                    </div>
                                </div>
                            </form>
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