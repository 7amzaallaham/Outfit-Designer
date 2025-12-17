
window.addEventListener("load", function () {
  document.getElementById("username").value = "";
  document.getElementById("password").value = "";
});

function showPopup(message) {
  
  const popup = document.getElementById("popup");
  document.getElementById("popupText").textContent = message;
  popup.style.display = "flex";
  
  document.getElementById("popupOk").onclick = function () {
    popup.style.display = "none";
  };
}


document.getElementById("loginBtn").addEventListener("click", function () {
  
  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value.trim();

  if (username === "" || password === "") {
    showPopup("Ungültige Eingabe");
    return; 
  }


  const savedUser = localStorage.getItem("savedUsername");
  const savedPass = localStorage.getItem("savedPassword");

  if (!savedUser || !savedPass) {
    showPopup("Kein Account vorhanden. Bitte registrieren.");
    return; 
  }

  
  if (username === savedUser && password === savedPass) {

    window.location.href = "garderobe-outfits.html";
  } else {
    
    showPopup("Ungültige Eingabe");
  }
});
