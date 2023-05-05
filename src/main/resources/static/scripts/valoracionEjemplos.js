
function validarNumeroVacio() {
    var inputValue = document.getElementById("idTopXejemplo").value;
    if (inputValue === "") {
    alert("Debe ingresar un TOP para realizar la estadística");
    return false;
    } else {
    return true;
    }
  }
document.querySelector('input[id="idTopXejemplo"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
    });

function validarNumero() {
  var numeroInput = document.getElementById("idTopXejemplo");
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

document.querySelector('input[id="idTopXejemplo"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionTopX() {
        var select = document.getElementById("cboConsultarTOPdeEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una opción de Top X ");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPdeEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionCategoria() {
        var select = document.getElementById("cbocol2ConsultarTOPEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una categoría");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cbocol2ConsultarTOPEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionFuente() {
        var select = document.getElementById("cboConsultarTOPFuenteEjemplo");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una fuente");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPFuenteEjemplo"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });  
