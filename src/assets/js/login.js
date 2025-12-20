
//  Popup-Funktion 
function showPopup(message, onOk) {
  const popup = document.getElementById("popup");
  const text = document.getElementById("popupText");
  const ok = document.getElementById("popupOk");

  text.textContent = message;
  popup.style.display = "flex";

  ok.onclick = function () {
    popup.style.display = "none";

    if (onOk) {
      onOk();
    }
  };
}


//Inputs beim Laden leeren (nur wenn es sie gibt)
window.addEventListener("load", function () {
  if (document.getElementById("username")) document.getElementById("username").value = "";
  if (document.getElementById("email")) document.getElementById("email").value = "";
  if (document.getElementById("password")) document.getElementById("password").value = "";
  if (document.getElementById("password2")) document.getElementById("password2").value = "";
});


// LOGIN 
if (document.getElementById("loginBtn")) {
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
}

// SIGN UP 
if (document.getElementById("signupBtn")) {
  console.log("login-signUp.js geladen");

  const btn = document.getElementById("signupBtn");
  console.log("Button gefunden?", btn);

  btn.addEventListener("click", function () {
    const username = document.getElementById("username").value.trim();
    const email = document.getElementById("email").value.trim();
    const pw1 = document.getElementById("password").value.trim();
    const pw2 = document.getElementById("password2").value.trim();

    if (username === "" || email === "" || pw1 === "" || pw2 === "") {
      showPopup("Ungültige Eingabe");
      return;
    }

    if (!email.includes("@") || !email.includes(".")) {
      showPopup("Ungültige Eingabe");
      return;
    }

    if (pw1 !== pw2) {
      showPopup("Ungültige Eingabe");
      return;
    }

    localStorage.setItem("savedUsername", username);
    localStorage.setItem("savedPassword", pw1);

    showPopup("Sign up erfolgreich", function () {
      window.location.href = "login.html";
    });
  });
}


// FORGOT PASSWORD 
if (document.getElementById("forgotBtn")) {
  document.getElementById("forgotBtn").addEventListener("click", function () {
    const email = document.getElementById("email").value.trim();

    if (email === "" || !email.includes("@") || !email.includes(".")) {
      showPopup("Ungültige Eingabe");
      return;
    }

    showPopup("E-Mail wurde verschickt!", function () {
      window.location.href = "login.html";
    });
  });
}
