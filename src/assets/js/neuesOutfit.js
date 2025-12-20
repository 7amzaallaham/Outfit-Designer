function nextKleidungsstück(id, list) {           //Funktion die ein zufälliges Stück aus einer Liste nimmt und anzeigt (jetzt parametrisiert wegen DRY)
    const bild = document.getElementById(id);
    let index = Math.floor(Math.random() * 4);     //Zufallszahl zwischen 0 und 4
    bild.src = list[index].bild;                   // ^ in zukunft muss list.size() ermittelt werden
}


document.getElementById("nextTshirt").addEventListener("click", () => {                    //tshirts Pfeile
    nextKleidungsstück("tshirtBild", tshirts_liste)
});

document.getElementById("previousTshirt").addEventListener("click", () => {
    nextKleidungsstück("tshirtBild", tshirts_liste)
});

//--------------------------------

document.getElementById("nextHose").addEventListener("click", () => {                     //hosen Pfeile
    nextKleidungsstück("hoseBild", hosen_liste)
});

document.getElementById("previousHose").addEventListener("click", () => {
    nextKleidungsstück("hoseBild", hosen_liste)
});

//-------------------------------

document.getElementById("previousSchuhe").addEventListener("click", () => {              //schuhe Pfeile
    nextKleidungsstück("schuheBild", schuhe_liste)
});

document.getElementById("nextSchuhe").addEventListener("click", () => {
    nextKleidungsstück("schuheBild", schuhe_liste)
});


//---------------------------------------------------------------

document.getElementById("speichernButton").addEventListener("click", () => {       //Zukünftig wäre es sinvoll den Outfit Konstrukor 
    alert("Outfit gespeichert");                                                   //aufzurufen und das Objekt in unserer Dummy liste speichern
    window.location.href = "garderobe-outfits.html";
});

//--------------------------------------------------------------

document.getElementById("boxTshirt").addEventListener("click", () => {
    window.location.href = "garderobe-tshirts.html";
});

document.getElementById("boxHose").addEventListener("click", () => {
    window.location.href = "garderobe-hosen.html";
});

document.getElementById("boxSchuhe").addEventListener("click", () => {
    window.location.href = "garderobe-schuhe.html";
});



