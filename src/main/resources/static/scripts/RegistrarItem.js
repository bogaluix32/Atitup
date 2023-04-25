function validarSeleccion() {
    var select = document.getElementById("cboCategoryItem");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar una categoría para el item");
      select.focus();
      return false;
    }
    return true;
  }

  function validarSeleccionRespuesta() {
    var select = document.getElementById("cboFuenteRespuesta");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar la fuente de la respuesta");
      select.focus();
      return false;
    }
    return true;
  }

  function validarSeleccionEjemplo() {
    var select = document.getElementById("cboFuenteEjemplo");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar la fuente del ejemplo");
      select.focus();
      return false;
    }
    return true;
  }

  function validarPregunta() {
    var inputValue = document.getElementById("idPregunta").value;

    if (inputValue === "") {
    alert("La pregunta no puede estar vacía");
    return false;
    } else {
    return true;
    }
  }

  function validarRespuesta() {
    var inputValue = document.getElementById("idRespuesta").value;

    if (inputValue === "") {
    alert("La respuesta no puede estar vacía");
    return false;
    } else {
    return true;
    }
  }

  function validarEjemplo() {
    var inputValue = document.getElementById("idEjemplo").value;

    if (inputValue === "") {
    alert("El ejemplo no puede estar vacía");
    return false;
    } else {
    return true;
    }
  }

  document.querySelector('select[id="cboCategoryItem"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
    });
       
  document.querySelector('select[id="cboFuenteRespuesta"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
   });
       
  document.querySelector('select[id="cboFuenteEjemplo"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
   });
     
  document.querySelector('input[id="idPregunta"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
   });

  document.querySelector('input[id="idRespuesta"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
   });

  document.querySelector('input[id="idEjemplo"]').addEventListener('click', function(event) {
  event.preventDefault(); // evita que se envíe el formulario automáticamente
    });
    