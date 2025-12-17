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

