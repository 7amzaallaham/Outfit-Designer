//Kleidungsstueck für Tshirts, Hosen und Schuhe je nach Seite aus Backend
const page = window.location.pathname;

let endpoint = null; //Endpoint wird dann später gesetzt auf z.b tshirts, hosen...

if (page.includes("tshirts")) endpoint = "tshirts";
if (page.includes("hosen")) endpoint = "hosen";
if (page.includes("schuhe")) endpoint = "schuhe";

if (endpoint) {
    fetch(`http://localhost:8080/garderobe/${endpoint}`)
        .then(response => response.json())
        .then(items => {
            const container = document.getElementById("itemContainer");
            container.innerHTML = "";

            items.forEach(item => {
                const div = document.createElement("div"); //neues div für einzelnen Kleidungsstück erstellen
                div.classList.add("kleidungsstück"); //dem div die CSS Klasse für Styling hinzufügen
                div.innerHTML = `<img src="${item.bildpfad}"> <button class="löschen_veröffentlichen">...</button>`; //Kleidungsstück und löschen/veröffentlichen buttin in das div einfügen

                container.appendChild(div);
            });
        })
        .catch(error => alert(error));
}
//Outfits aus Backend holen
if (page.includes("outfits")) {
    fetch("http://localhost:8080/garderobe/outfits")
        .then(response => response.json())
        .then(outfits => {
            const container = document.getElementById("outfitContainer");
            container.innerHTML = "";

            outfits.forEach(outfit => {
                const div = document.createElement("div");
                div.classList.add("kleidungsstück");
                div.innerHTML = `
                <img src="${outfit.tshirt.bildpfad}">
                <img src="${outfit.hose.bildpfad}">
                <img src="${outfit.schuhe.bildpfad}">
                <button class="löschen_veröffentlichen">...</button>`;

                container.appendChild(div);
            });
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


/*Löschen / Veröffentlichen
document.querySelectorAll(".löschen_veröffentlichen").forEach(button => {
    button.addEventListener("click", () => togglePopup("aktionPopup"));
});
*/
document.addEventListener("click", event => {
  if (event.target.classList.contains("löschen_veröffentlichen")) {
    togglePopup("aktionPopup");
  }
});

document.getElementById("loschenButton").addEventListener("click", () => {
    alert("Teil wurde gelöscht");
    document.getElementById("aktionPopup").classList.remove("aktiv");
});

document.getElementById("veroffentlichenButton").addEventListener("click", () => {
    alert("Teil wurde veröffentlicht");
    window.location.href = "community-profil.html";
});