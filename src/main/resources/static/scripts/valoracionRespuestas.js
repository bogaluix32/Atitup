
function validarNumeroVacio() {
    var inputValue = document.getElementById("idTopX").value;
    if (inputValue === "") {
    alert("Debe ingresar un TOP para realizar la estadística");
    return false;
    } else {
    return true;
    }
  }
document.querySelector('input[id="idTopX"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
    });

function validarNumero() {
  var numeroInput = document.getElementById("idTopX");
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

document.querySelector('input[id="idTopX"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionTopX() {
        var select = document.getElementById("cboConsultarTOPde");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una opción de Top X ");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPde"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionCategoria() {
        var select = document.getElementById("cboConsultarTOPCategoria");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una categoría");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPCategoria"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });

    function validarSeleccionFuente() {
        var select = document.getElementById("cboConsultarTOPFuente");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar una fuente");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboConsultarTOPFuente"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });  
