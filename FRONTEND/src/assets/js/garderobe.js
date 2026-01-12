//Dummy Bilder für Tshirts, Hosen und Schuhe je nach Seite aus Backend
const page = window.location.pathname;

let endpoint = null; //Endpoint wird dann später gesetzt auf z.b tshirts, hosen...

if (page.includes("tshirts")) endpoint = "tshirts";
if (page.includes("hosen")) endpoint = "hosen";
if (page.includes("schuhe")) endpoint = "schuhe";

if (endpoint) {
    fetch(`http://localhost:8080/garderobe/${endpoint}`)
        .then(response => response.json())
        .then(images => {
            document.getElementById("item1").src = images[0];
            document.getElementById("item2").src = images[1];
            document.getElementById("item3").src = images[2];
            document.getElementById("item4").src = images[3];
        })
        .catch(error => alert(error));
}
//Dummy Outfits (je 3 Bilder) aus Backend
if (page.includes("outfits")) {
    fetch("http://localhost:8080/garderobe/outfits")
        .then(response => response.json())
        .then(outfits => {
            document.getElementById("o1_1").src = outfits[0][0];
            document.getElementById("o1_2").src = outfits[0][1];
            document.getElementById("o1_3").src = outfits[0][2];

            document.getElementById("o2_1").src = outfits[1][0];
            document.getElementById("o2_2").src = outfits[1][1];
            document.getElementById("o2_3").src = outfits[1][2];
        })
        .catch(error => alert(error));
}

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