<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Nuevo pedido</title>
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
                                        <i class="fas fa-truck-loading"></i> PEDIDO NUEVO
                                    </h1>
                                </div>
                            </div>
                         <form action="ServletControlador?accion=put&idCliente=${cliente.id}" method="POST" class="was-validated">
                            <div class="row justify-content-end" style="margin-top: 2%">
                                <div class="col-4">
                                    Cantidad
                                </div>
                                <div class="col-4">
                                    Costo
                                </div>
                            </div>
                            <c:forEach items="${productos}" var="producto">
                                <div class="row" style="margin-top: 2%">
                                    <div class="col-2">
                                       <h4> ${producto.nombre}</h4>
                                    </div>
                                    <div class="col">
                                        <div class="form-group">
                                            <div class="input-group mb-3">
                                                <input type="number" class="form-control" id="${producto.nombre}Cantidad"
                                                       onkeyup="multiplicaCantidad('${producto.nombre}', ${producto.precioPKilo})"
                                                       name="${producto.nombre}Cantidad" autocomplete="off" step="0.01" required/>
                                                <div class="input-group-append">
                                                    <span class="input-group-text" id="basic-addon1">Kg</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col">
                                        <div class="form-group">
                                            <div class="input-group mb-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text" id="basic-addon2">$</span>
                                                </div>
                                                <input type="number" class="form-control" id="${producto.nombre}Total"
                                                       name="${producto.nombre}Total" disabled required/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <div class="row justify-content-end" style="margin-top: 2%">
                                <div class="col-5" style="text-align: right">
                                    <h4>Total</h4>
                                </div>
                                <div class="col-5">
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="basic-addon3">$</span>
                                        </div>
                                        <input type="number" class="form-control" id="total" name="${producto.nombre}Total"  disabled required/>
                                    </div>
                                </div>
                            </div>

                            <script>
                                function multiplicaCantidad (nombreProducto, precioPKilo) {
                                    var cantidad = document.getElementById(nombreProducto + 'Cantidad').value;
                                    document.getElementById(nombreProducto + 'Total').value = Math.round(precioPKilo * cantidad);
                                    document.getElementById('total').value =
                                        +document.getElementById('ArrozTotal').value +
                                        +document.getElementById('FrijolTotal').value +
                                        +document.getElementById('MaízTotal').value;
                                }

                                function limpiar() {
                                    document.getElementById('ArrozTotal').value = '';
                                    document.getElementById('FrijolTotal').value = '';
                                    document.getElementById('MaízTotal').value = '';
                                    document.getElementById('ArrozCantidad').value = '';
                                    document.getElementById('FrijolCantidad').value = '';
                                    document.getElementById('MaízCantidad').value = '';
                                    document.getElementById('total').value = '';
                                }
                            </script>
                             <div class="d-flex justify-content-between">
                                 <button type="submit" class="btn btn-primary">
                                     <i class="fas fa-paper-plane"></i> Enviar
                                 </button>
                                 <button onclick="limpiar()" class="btn btn-danger">
                                     <i class="fas fa-times"></i> Limpiar
                                 </button>
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
