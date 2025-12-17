function nextShirt() {
    const bild = document.getElementById("tshirtBild");
    let index = Math.floor(Math.random() * 4);            //Zufallszahl zwischen 0 und 4
    bild.src = tshirts_liste[index].bild;                  //in zukunft muss tshirts_liste.size() ermittelt werden
}

document.getElementById("nextTshirt").addEventListener("click", nextShirt);
document.getElementById("previousTshirt").addEventListener("click", nextShirt);

//--------------------------------

function nextHose() {
    const bild = document.getElementById("hoseBild");
    let index = Math.floor(Math.random() * 4);
    bild.src = hosen_liste[index].bild;
}

document.getElementById("previousHose").addEventListener("click", nextHose);
document.getElementById("nextHose").addEventListener("click", nextHose);

// -------------------------------

function nextSchuhe() {
    const bild = document.getElementById("schuheBild");
    let index = Math.floor(Math.random() * 4);
    bild.src = schuhe_liste[index].bild;
}

document.getElementById("previousSchuhe").addEventListener("click", nextSchuhe);
document.getElementById("nextSchuhe").addEventListener("click", nextSchuhe);

//---------------------------------

document.getElementById("speichernButton").addEventListener("click", () => {
    alert("Outfit gespeichert");
    window.location.href = "garderobe-outfits.html";
});

//---------------------------------

document.getElementById("boxTshirt").addEventListener("click", () => {
    window.location.href = "garderobe-tshirts.html";
});

document.getElementById("boxHose").addEventListener("click", () => {
    window.location.href = "garderobe-hosen.html";
});

document.getElementById("boxSchuhe").addEventListener("click", () => {
    window.location.href = "garderobe-schuhe.html";
});



