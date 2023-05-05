function validarSeleccionCategoria() {
    var select = document.getElementById("cboPDF2");
    if (select.selectedIndex == 0) {
    alert("Debe seleccionar una categoría");
    select.focus();
    return false;
    }
    return true;
}
document.querySelector('input[id="cboPDF2"]').addEventListener('click', function(event) {
event.preventDefault(); // evita que se envíe el formulario automáticamente
    });

    function validarSeleccionItem() {
        var select = document.getElementById("cboPDF3");
        if (select.selectedIndex == 0) {
        alert("Debe seleccionar un item ");
        select.focus();
        return false;
        }
        return true;
    }
    document.querySelector('input[id="cboPDF3"]').addEventListener('click', function(event) {
    event.preventDefault(); // evita que se envíe el formulario automáticamente
        });