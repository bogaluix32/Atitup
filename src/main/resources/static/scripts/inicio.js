var miBoton = document.getElementById("miBoton");
var miModal = document.getElementById("miModal");
var cerrar = document.getElementsByClassName("cerrar")[0];

miBoton.onclick = function() {
  miModal.style.display = "block";
}
cerrar.onclick = function() {
  miModal.style.display = "none";
}
window.onclick = function(event) {
  if (event.target == miModal) {
    miModal.style.display = "none";
  }
}


var miBoton2 = document.getElementById("miBoton2");
var miModal2 = document.getElementById("miModal2");
var cerrar2 = document.getElementsByClassName("cerrar2")[0];

miBoton2.onclick = function() {
  miModal2.style.display = "block";
}
cerrar2.onclick = function() {
  miModal2.style.display = "none";
}
window.onclick = function(event) {
  if (event.target == miModal2) {
    miModal2.style.display = "none";
  }
}

function validarCorreoElectronico() {
  var email = document.getElementById("email").value;
  var emailPattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

  if (!emailPattern.test(email)) {
    alert("Ingrese un correo electrónico válido");
    document.getElementById("email").focus();
    return false;
  }
  return true;
}

function validarCorreoElectronico2() {
  var email = document.getElementById("email2").value;
  var emailPattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

  if (!emailPattern.test(email)) {
    alert("Ingrese un correo electrónico válido");
    document.getElementById("email2").focus();
    return false;
  }
  return true;
}