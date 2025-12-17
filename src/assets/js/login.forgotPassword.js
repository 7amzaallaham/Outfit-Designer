
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
