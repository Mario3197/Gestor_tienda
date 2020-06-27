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
                                        <i class="fas fa-truck-loading"></i> PEDIDO NUEVO
                                    </h1>
                                </div>
                            </div>
                         <form action="pedido?accion=crear" method="POST" class="was-validated">
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
                                                       name="${producto.nombre}Cantidad" autocomplete="off" required/>
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
                                        <input type="number" class="form-control" id="sumaTotal" name="sumaTotal" readonly="readonly"
                                               required/>
                                    </div>
                                </div>
                            </div>
                             <div class="row">
                                 <div class="col-12 justify-content-center">
                                     <h3>¿Envío?</h3>
                                     <div class="form-check form-check-inline">
                                         <label class="form-check-label" for="inlineRadio1"> <h4>Sí</h4></label>
                                         <input class="form-check-input" type="radio" name="radioButton" id="inlineRadio1" value="si"
                                                checked="checked" style="margin-left: 50%" onclick="verificaCheckbox()">
                                     </div>
                                     <div class="form-check form-check-inline" style="margin-left: 40%">
                                         <label class="form-check-label" for="inlineRadio2"><h4>No</h4></label>
                                         <input class="form-check-input" type="radio" name="radioButton" id="inlineRadio2" value="no"
                                                style="margin-left: 50%" onclick="verificaCheckbox()">
                                     </div>
                                     <input type="text" class="form-control" id="direccion" name="direccion"/>
                                 </div>
                             </div>

                            <script>
                                function multiplicaCantidad (nombreProducto, precioPKilo) {
                                    var cantidad = document.getElementById(nombreProducto + 'Cantidad').value;
                                    document.getElementById(nombreProducto + 'Total').value = Math.round(precioPKilo * cantidad);
                                    document.getElementById('sumaTotal').value =
                                        +document.getElementById('ArrozTotal').value +
                                        +document.getElementById('FrijolTotal').value +
                                        +document.getElementById('MaizTotal').value;
                                }

                                function limpiar() {
                                    document.getElementById('ArrozTotal').value = '';
                                    document.getElementById('FrijolTotal').value = '';
                                    document.getElementById('MaizTotal').value = '';
                                    document.getElementById('ArrozCantidad').value = '';
                                    document.getElementById('FrijolCantidad').value = '';
                                    document.getElementById('MaizCantidad').value = '';
                                    document.getElementById('sumaTotal').value = '';
                                    document.getElementById('direccion').value = '';
                                }

                                function verificaCheckbox() {
                                    if (document.getElementsByName("radioButton")[0].checked) {
                                        document.getElementById('direccion').disabled = false;
                                    } else {
                                        document.getElementById('direccion').disabled = true;
                                    }
                                }
                            </script>
                             <div class="d-flex justify-content-between" style="margin-top: 5%;">
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
