
function validarNumeroVacio() {
    var inputValue = document.getElementById("idTopXRespuestayEjemplo").value;
    if (inputValue === "") {
    alert("Debe ingresar un TOP para realizar la estadística");
    return false;
    } else {
    return true;
    }
  }
document.querySelector('input[id="idTopXRespuestayEjemplo"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
    });

function validarNumero() {
  var numeroInput = document.getElementById("idTopXRespuestayEjemplo");
  var numero = numeroInput.value;
  var numeroPattern = /^\d+$/;

  if (!numeroPattern.test(numero)) {
    alert("El valor ingresado debe ser un número");
    numeroInput.focus();
    return false;
  }
  // Si se llega hasta aquí, el número es válido
  return true;
}

document.querySelector('input[id="idTopXRespuestayEjemplo"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionTopX() {
        var select = document.getElementById("cboConsultarTOPdeRespuestayEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una opción de Top X ");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPdeRespuestayEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionCategoria() {
        var select = document.getElementById("cboConsultarTOPRespuestayEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una categoría");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPRespuestayEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionFuente() {
        var select = document.getElementById("cboConsultarTOPRespuestayEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una fuente");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPRespuestayEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });  
