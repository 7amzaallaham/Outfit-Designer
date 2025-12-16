class kleidungsstück {

    constructor(name, farbe, bild, marke) {
        this.outfitname = name;
        this.farbe = farbe;
        this.bild = bild;
        this.marke = marke;
    }
}

var tshirts_liste = [
    new kleidungsstück("tshirt 1", "#d58524ff", "assets/images/t-shirt1.jpg", "adidas"),
    new kleidungsstück("tshirt 2", "#b4dd1e", "assets/images/t-shirt2.jpg", "Nike"),
    new kleidungsstück("tshirt 3", "#249fd8ff", "assets/images/t-shirt3.jpg", "H&M"),
    new kleidungsstück("tshirt 4", "#de1a75ff", "assets/images/t-shirt4.jpg", "Zara")
];


var hosen_liste = [
    new kleidungsstück("hose 1", "#d58524ff", "assets/images/hose1.jpg", "adidas"),
    new kleidungsstück("hose 2", "#b4dd1e", "assets/images/hose2.jpg", "Nike"),
    new kleidungsstück("hose 3", "#249fd8ff", "assets/images/hose3.jpg", "H&M"),
    new kleidungsstück("hose 4", "#de1a75ff", "assets/images/hose4.jpg", "Zara")
];

var schuhe_liste = [
    new kleidungsstück("schuhe 1", "#d58524ff", "assets/images/shuhe1.jpg", "adidas"),
    new kleidungsstück("schuhe 2", "#b4dd1e", "assets/images/shuhe2.jpg", "Nike"),
    new kleidungsstück("schuhe 3", "#249fd8ff", "assets/images/shuhe3.jpg", "H&M"),
    new kleidungsstück("schuhe 4", "#de1a75ff", "assets/images/shuhe4.jpg", "Zara")
];