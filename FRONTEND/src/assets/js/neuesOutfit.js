function nextKleidungsstück(id, list) {           //Funktion die ein zufälliges Stück aus einer Liste nimmt und anzeigt (jetzt parametrisiert wegen DRY)
    const bild = document.getElementById(id);
    let index = Math.floor(Math.random() * 4);     //Zufallszahl zwischen 0 und 4
    bild.src = list[index].bild;                   //in Zukunft muss list.size() ermittelt werden
}


// document.getElementById("nextTshirt").addEventListener("click", () => {                    //tshirts Pfeile
//     nextKleidungsstück("tshirtBild", tshirts_liste)                   //man konnte dieselbe id nicht zweimal vergeben, deswegen viele Duplikate
// });

document.getElementById("nextTshirt").addEventListener("click", () => {
    const bild = document.getElementById("tshirtBild");
    fetch("http://localhost:8080/neuesoutfit/testservice")         //FETCH Funktioniert!!!!!
    .then(response => response.text())
    .then(path => bild.src = path)
    .catch(error => alert(error));
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

document.getElementById("boxTshirt").addEventListener("click", () => {            //weiterleiten zur Garderobe wenn man auf die Kleidungsbox clickt
    window.location.href = "garderobe-tshirts.html";
});

document.getElementById("boxHose").addEventListener("click", () => {
    window.location.href = "garderobe-hosen.html";
});

document.getElementById("boxSchuhe").addEventListener("click", () => {
    window.location.href = "garderobe-schuhe.html";
});



