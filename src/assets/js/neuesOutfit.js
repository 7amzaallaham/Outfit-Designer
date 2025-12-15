function nextTshirt(tshirt) {
    let index = 0;

    const bild = document.getElementById("tshirtBild");

    bild.bild = tshirt.bild;
}

document.getElementById("nextTshirt").addEventListener("click", () => {
    nextTshirt(tshirts_liste[index]);

    index++;

    if (index >= tshirts.length) {
        index = 0; // wieder von vorne
    }
});
