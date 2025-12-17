function filterPopup() {
    document.getElementById("filterPopup").classList.toggle("aktiv");
}
function filterAnwenden() {
    document.getElementById("filterPopup").classList.remove("aktiv");
}

document.getElementById("filterButton").addEventListener("click", filterPopup);
document.getElementById("filterAnwendenButton").addEventListener("click", filterAnwenden);
//-----------------

function addPopup() {
    document.getElementById("addPopup").classList.toggle("aktiv");
}
function hochladen() {
  document.getElementById("addPopup").classList.remove("aktiv");
}

document.getElementById("addButton").addEventListener("click", addPopup);
document.getElementById("hochladenButton").addEventListener("click", hochladen);
//-----------------

function farbePopup() {
    document.getElementById("farbePopup").classList.toggle("aktiv");
}

function farbeAnwenden() {
    document.getElementById("farbePopup").classList.remove("aktiv");
}

document.getElementById("farbeAuwahlenButton").addEventListener("click", farbePopup);
document.getElementById("farbeAnwenden").addEventListener("click", farbeAnwenden);
//---------------

document.querySelectorAll(".löschen_veröffentlichen").forEach(button => {
    button.addEventListener("click", () => {
        document.getElementById("aktionPopup").classList.toggle("aktiv");
    });
});

document.getElementById("loschenButton").addEventListener("click", () => {
    alert("Teil wurde gelöscht");
    document.getElementById("aktionPopup").classList.remove("aktiv");
});

document.getElementById("veroffentlichenButton").addEventListener("click", () => {
    alert("Teil wurde veröffentlicht");
    window.location.href = "community-profil.html";
});