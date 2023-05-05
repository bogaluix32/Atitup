function validarSeleccionCategoria() {
    var select = document.getElementById("cbo1AnalsisCategoria");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar una categoría");
      select.focus();
      return false;
    }
    return true;
  }
    document.querySelector('input[id="cbo1AnalsisCategoria"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
    });
  
  function validarSeleccionItem() {
    var select = document.getElementById("cboAnalisisItem");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar un item");
      select.focus();
      return false;
    }
    return true;
  }

  document.querySelector('input[id="cboAnalisisItem"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
});

  function validarSeleccionCategoriaEspecifica() {
    var select = document.getElementById("cboCategoria");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar una categoría");
      select.focus();
      return false;
    }
    return true;
  }

  document.querySelector('input[id="cboCategoria"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
    });

  function validarSeleccionCategoria() {
    var select = document.getElementById("cboItem");
    if (select.selectedIndex == 0) {
      alert("Debe seleccionar un item");
      select.focus();
      return false;
    }
    return true;
  }

    document.querySelector('input[id="cboItem"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
    });
