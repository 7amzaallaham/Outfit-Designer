function togglePopup(popupId) {
    document.getElementById(popupId).classList.toggle("aktiv");
}
function removePopup(popupId) {
    document.getElementById(popupId).classList.remove("aktiv");
}

//Filter Popup
document.getElementById("filterButton").addEventListener("click", () => togglePopup("filterPopup"));
document.getElementById("filterAnwendenButton").addEventListener("click", () => removePopup("filterPopup"));

//Add / Hochladen Popup
document.getElementById("addButton").addEventListener("click", () => togglePopup("addPopup"));
document.getElementById("hochladenButton").addEventListener("click", () => removePopup("addPopup"));

//Farbe Popup in Hochladen Popup
document.getElementById("farbeAuwahlenButton").addEventListener("click", () => togglePopup("farbePopup"));
document.getElementById("farbeAnwenden").addEventListener("click", () => removePopup("farbePopup"));


//Löschen / Veröffentlichen
document.querySelectorAll(".löschen_veröffentlichen").forEach(button => {
    button.addEventListener("click", () => togglePopup("aktionPopup"));
});

document.getElementById("loschenButton").addEventListener("click", () => {
    alert("Teil wurde gelöscht");
    document.getElementById("aktionPopup").classList.remove("aktiv");
});

document.getElementById("veroffentlichenButton").addEventListener("click", () => {
    alert("Teil wurde veröffentlicht");
    window.location.href = "community-profil.html";
});