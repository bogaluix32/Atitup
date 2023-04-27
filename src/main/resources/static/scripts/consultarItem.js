    // BOTON HACER CONSULTA
    
    function validarSeleccionCategoria() {
        var select = document.getElementById("cboCategoryUser");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una categoría");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboCategoryUser"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionPreguntas() {
        var select = document.getElementById("cboPreguntaUser");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una pregunta");
        select.focus();
        return false;
        }
        return true;
    }    
    document.querySelector('input[id="cboPreguntaUser"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

        
// BOTON REGISTRAR CONSULTA

    function validarComentarioRespuestaVacio() {
        var inputValue = document.getElementById("idComentario").value;
        if (inputValue === "") {
        alert("El comentario de la respuesta no puede estar vacío");
        return false;
        } else {
        return true;
        }
      }
    document.querySelector('input[id="idComentario"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionCalificarRespuesta() {
        var select = document.getElementById("cboCalificar");
        if (select.selectedIndex == 0) {
        alert("Debe asignar una calificación a la respuesta");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboCalificar"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarComentarioEjemploVacio() {
        var inputValue = document.getElementById("idComentEjemplo").value;
        if (inputValue === "") {
        alert("El comentario del ejemplo no puede estar vacío");
        return false;
        } else {
        return true;
        }
      }
    document.querySelector('input[id="idComentEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionCalificarEjemplo() {
        var select = document.getElementById("cboCalificarEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe asignar una calificación al ejemplo");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboCalificarEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });