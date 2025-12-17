
window.addEventListener("load", function () {
  document.getElementById("username").value = "";
  document.getElementById("email").value = "";
  document.getElementById("password").value = "";
  document.getElementById("password2").value = "";
});

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

