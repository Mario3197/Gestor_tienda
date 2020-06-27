<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>
<html>
    <head>
        <title>Actualizar usuario</title>
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
                                        <i class="fas fa-user-edit"></i> Modificar usuario
                                    </h1>
                                </div>
                            </div>
                            <form action="/cliente?accion=actualizar" method="POST" class="was-validated">
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label for="name">Nombre</label>
                                        <input type="text" class="form-control" id="name" name="name" autocomplete="nel" value="${usuario.nombre}" required/>
                                    </div>
                                    <div class="form-group">
                                        <label for="telefono">Teléfono</label>
                                        <input type="tel" class="form-control" id="telefono" name="telefono" autocomplete="nel" value="${usuario.telefono}" minlength="10"
                                               maxlength="10" required/>
                                    </div>
                                    <div class="form-group">
                                        <label for="correo">Correo</label>
                                        <input type="email" class="form-control" id="correo" name="correo" autocomplete="nel" value="${usuario.correo}" required/>
                                    </div>
                                    <div class="form-group">
                                        <label>Dirección</label>
                                        <input type="text" class="form-control" name="direccion" value="${usuario.direccion}"></input>
                                    </div>
                                    <div class="form-group">
                                        <label for="usuario">Usuario</label>
                                        <input type="text" class="form-control" id="usuario" name="usuario" autocomplete="nel" value="${usuario.usuario}" required/>
                                    </div>
                                    <div class="form-group">
                                        <label for="pass">Contraseña</label>
                                        <input type="password" class="form-control" id="pass" name="pass" autocomplete="nel"
                                               value="${usuario.password}" minlength="8" required/>
                                    </div>
                                </div>
                                <div class="d-flex justify-content-end" style="margin-top: 5%;">
                                    <button type="submit" class="btn btn-primary">
                                        <i class="fas fa-pencil-alt"></i> Enviar
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