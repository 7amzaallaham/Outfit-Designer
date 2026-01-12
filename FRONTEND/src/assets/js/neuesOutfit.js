// function nextKleidungsstück(id, list) {           //Funktion die ein zufälliges Stück aus einer Liste nimmt und anzeigt (jetzt parametrisiert wegen DRY)
//     const bild = document.getElementById(id);
//     let index = Math.floor(Math.random() * 4);     //Zufallszahl zwischen 0 und 4
//     bild.src = list[index].bild;                   //in Zukunft muss list.size() ermittelt werden
// }

// document.getElementById("nextTshirt").addEventListener("click", () => {
//     const bild = document.getElementById("tshirtBild");
//     fetch("http://localhost:8080/neuesOutfit/nextTshirt")         //FETCH Funktioniert!!!!!
//     .then(response => response.text())
//     .then(path => bild.src = path)
//     .catch(error => alert(error));
// });


function backendNextKleidungsstueck(id, mapping) {      //funktion um zufälliges Bild aus dem Backend zu holen
    const bild = document.getElementById(id);
    fetch("http://localhost:8080/neuesOutfit/" + mapping)
    .then(antwort => antwort.text())                        //JSON in String umwandeln
    .then(pfad => bild.src = pfad)
    .catch(error => alert(error));
}


document.getElementById("backendTest").addEventListener("click", () => {      //testfunktion
    fetch("http://localhost:8080/neuesOutfit/backendTest");
});

//////////////////////////////////////////////////////// tshirt

document.getElementById("nextTshirt").addEventListener("click", () => {                    //tshirt pfeile
    backendNextKleidungsstueck("tshirtBild", "nextTshirt")
});

document.getElementById("previousTshirt").addEventListener("click", () => {
    backendNextKleidungsstueck("tshirtBild", "nextTshirt")
})


///////////////////////////////////////////////////////// hose

document.getElementById("nextHose").addEventListener("click", () => {                     //hosen Pfeile
    backendNextKleidungsstueck("hoseBild", "nextHose")
});

document.getElementById("previousHose").addEventListener("click", () => {
    backendNextKleidungsstueck("hoseBild", "nextHose")
});


///////////////////////////////////////////////////////// schuhe

document.getElementById("previousSchuhe").addEventListener("click", () => {              //schuhe Pfeile
    backendNextKleidungsstueck("schuheBild", "nextSchuhe")
});

document.getElementById("nextSchuhe").addEventListener("click", () => {
    backendNextKleidungsstueck("schuheBild", "nextSchuhe")
});


//---------------------------------------------------------------

document.getElementById("speichernButton").addEventListener("click", () => {       //!!!!!!!!!!!!!!!!!!!!!!!! muss geändert werden
    const outfit = {                         //noch nicht fertigs
        bild1: "bild",
        bild2: "bild2"
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



