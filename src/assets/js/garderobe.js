function filterPopupToggle() {
    document.getElementById("filterPopup").classList.toggle("aktiv");
}

document.getElementById("filterButton").addEventListener("click", filterPopupToggle);

function addPopupToggle() {
    document.getElementById("addPopup").classList.toggle("aktiv");
}

document.getElementById("addButton").addEventListener("click", addPopupToggle);
