function backendNextKleidungsstueck(id, mapping) {      //funktion um zufälliges Bild aus dem Backend zu holen
    const bild = document.getElementById(id);
    fetch("http://localhost:8080/neuesOutfit/" + mapping)
    .then(antwort => antwort.text())                        //JSON in String umwandeln
    .then(pfad => bild.src = pfad)
    .catch(error => alert(error));
}


document.getElementById("backendTest").addEventListener("click", () => {      //testfunktion erstellt Objekte im Backend
    fetch("http://localhost:8080/neuesOutfit/backendTest");
});

//////////////////////////////////////////////////////// tshirt

document.getElementById("nextTshirt").addEventListener("click", () => {                    //tshirt pfeile
    backendNextKleidungsstueck("tshirtBild", "randomTshirt")
});

document.getElementById("previousTshirt").addEventListener("click", () => {
    backendNextKleidungsstueck("tshirtBild", "randomTshirt")
})


///////////////////////////////////////////////////////// hose

document.getElementById("nextHose").addEventListener("click", () => {                     //hosen Pfeile
    backendNextKleidungsstueck("hoseBild", "randomHose")
});

document.getElementById("previousHose").addEventListener("click", () => {
    backendNextKleidungsstueck("hoseBild", "randomHose")
});


///////////////////////////////////////////////////////// schuhe

document.getElementById("previousSchuhe").addEventListener("click", () => {              //schuhe Pfeile
    backendNextKleidungsstueck("schuheBild", "randomSchuhe")
});

document.getElementById("nextSchuhe").addEventListener("click", () => {
    backendNextKleidungsstueck("schuheBild", "randomSchuhe")
});


//---------------------------------------------------------------

document.getElementById("speichernButton").addEventListener("click", () => {      //Sendet alle Bilder vom neu erstellten Outfit ans Backend
    const tshirt = document.getElementById("tshirtBild").src;
    const hose = document.getElementById("hoseBild").src;
    const schuhe = document.getElementById("schuheBild").src;
    const outfit = {                         
        TshirtBild: tshirt,
        HoseBild: hose,
        SchuheBild: schuhe
    }

    fetch("http://localhost:8080/neuesOutfit", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(outfit)
    })

    alert("Outfit gespeichert");                                                   
    window.location.href = "garderobe-outfits.html";
});

//--------------------------------------------------------------

document.getElementById("boxTshirt").addEventListener("click", () => {            //weiterleiten zur Garderobe wenn man auf die Kleidungsbox clickt
    window.location.href = "garderobe-tshirts.html";
});

document.getElementById("boxHose").addEventListener("click", () => {
    window.location.href = "garderobe-hosen.html";
});

document.getElementById("boxSchuhe").addEventListener("click", () => {
    window.location.href = "garderobe-schuhe.html";
});


// function nextKleidungsstück(id, list) {           //Funktion die ein zufälliges Stück aus einer Liste nimmt und anzeigt (jetzt parametrisiert wegen DRY)
//     const bild = document.getElementById(id);
//     let index = Math.floor(Math.random() * 4);     //Zufallszahl zwischen 0 und 4
//     bild.src = list[index].bild;             
// }