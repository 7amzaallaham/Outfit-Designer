// Hier steht der Code, der in allen html Dateien benutzt wird

// T-shirt Klassenstruktur:
class tshirt {

    constructor(outfitname, farbe, bild, marke) {
        this.outfitname = outfitname;
        this.farbe = farbe;
        this.bild = bild;
        this.marke = marke;
    }
}

var tshirts_liste = [
    new tshirt("tshirt 1", "#d58524ff", "images/t-shirt1.jpg", "adidas"),
    new tshirt("tshirt 2", "#b4dd1e", "images/t-shirt2.jpg", "Nike"),
    new tshirt("tshirt 3", "#249fd8ff", "images/t-shirt3.jpg", "H&M"),
    new tshirt("tshirt 4", "#de1a75ff", "images/t-shirt4.jpg", "Zara")
];
