<%@ page contentType="text/html;charset=UTF-8" %>
<div class="modal fade" tabindex="-1" role="dialog" id="registrarUsuarioModal">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header text-white" style="background-color: #1178D6;">
                <h5 class="modal-title">Registrar usuario</h5>
            </div>
            <form action="/login?accion=registrar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">Nombre</label>
                        <input type="text" class="form-control" id="name" name="name" autocomplete="nel" required/>
                    </div>
                    <div class="form-group">
                        <label for="telefono">Teléfono</label>
                        <input type="tel" class="form-control" id="telefono" name="telefono" autocomplete="nel" minlength="10"
                               maxlength="10" required/>
                    </div>
                    <div class="form-group">
                        <label for="correo">Correo</label>
                        <input type="email" class="form-control" id="correo" name="correo" autocomplete="nel" required/>
                    </div>
                    <div class="form-group">
                        <label>Dirección</label>
                        <textarea class="form-control" name="direccion" required></textarea>
                    </div>
                    <div class="form-group">
                        <label for="usuario">Usuario</label>
                        <input type="text" class="form-control" id="usuario" name="usuario" autocomplete="nel" required/>
                    </div>
                    <div class="form-group">
                        <label for="pass">Contraseña</label>
                        <input type="password" class="form-control" id="pass" name="pass" autocomplete="nel" minlength="8" required/>
                    </div>
                </div>
                <div class="modal-footer d-flex justify-content-between">
                    <button type="submit" class="btn btn-primary">
                        <i class="fas fa-save"></i> Guardar
                    </button>
                    <button type="submit" class="btn btn-danger" data-dismiss="modal">
                        <i class="fas fa-times"></i> Cerrar
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>