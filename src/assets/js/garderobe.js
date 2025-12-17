function filterPopupToggle() {
    document.getElementById("filterPopup").classList.toggle("aktiv");
}
function filterAnwenden() {
    document.getElementById("filterPopup").classList.remove("aktiv");
}

document.getElementById("filterButton").addEventListener("click", filterPopupToggle);
document.getElementById("filterAnwendenButton").addEventListener("click", filterAnwenden);
//-----------------

function addPopupToggle() {
    document.getElementById("addPopup").classList.toggle("aktiv");
}
function hochladen() {
  document.getElementById("addPopup").classList.remove("aktiv");
}

document.getElementById("addButton").addEventListener("click", addPopupToggle);
document.getElementById("hochladenButton").addEventListener("click", hochladen);
//-----------------

function farbePopupToggle() {
    document.getElementById("farbePopup").classList.toggle("aktiv");
}

function farbeAnwenden() {
    document.getElementById("farbePopup").classList.remove("aktiv");
}

document.getElementById("farbeAuwahlenButton").addEventListener("click", farbePopupToggle);
document.getElementById("farbeAnwenden").addEventListener("click", farbeAnwenden);