function validarNombreVacio() {
    var inputValue = document.getElementById("idName").value;

    if (inputValue === "") {
    alert("El nombre no puede estar vacío");
    return false;
    } else {
    return true;
    }
  }

function validarNombreCategoria() {
    var nombreCategoria = document.getElementById("idName").value;
    var letters = /^[A-Za-z]+$/;
  
    if (!nombreCategoria.match(letters)) {
      alert("Ingrese solamente letras en el nombre de la categoría");
      document.getElementById("idName").focus();
      return false;
    }
    return true;
  }

  function validarDescripcion() {
    var inputValue = document.getElementById("idDescription").value;

    if (inputValue === "") {
    alert("La descripción no puede estar vacía");
    return false;
    } else {
    return true;
    }
  }

  function validarSeleccion() {
    var select = document.getElementById("cboCategory");
    if (select.selectedIndex == -1) {
      alert("Debe seleccionar al menos un curso");
      select.focus();
      return false;
    }
    return true;
  }

  document.querySelector('input[id="idName"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente, este es para las dos primeras funciones
   });

  document.querySelector('input[id="idDescription"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
   });
    
  document.querySelector('select[id="cboCategory"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
    });
  