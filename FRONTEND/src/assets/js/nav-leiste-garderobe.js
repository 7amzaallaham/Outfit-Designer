class NavGarderobe extends HTMLElement {       //sekundäre navLeiste in der Garderobe

    connectedCallback() {
        const aktiv = this.getAttribute("aktiv");

        this.innerHTML = `
            <nav class="navLeiste">
                <a href="garderobe-outfits.html" class="tab ${aktiv === 'outfits' ? 'tab_aktiv' : ''}">
                    Outfits
                </a>
                <a href="garderobe-tshirts.html" class="tab ${aktiv === 'tshirts' ? 'tab_aktiv' : ''}">
                    T-Shirts
                </a>
                <a href="garderobe-hosen.html" class="tab ${aktiv === 'hosen' ? 'tab_aktiv' : ''}">
                    Hosen
                </a>
                <a href="garderobe-schuhe.html" class="tab ${aktiv === 'schuhe' ? 'tab_aktiv' : ''}">
                    Schuhe
                </a>
            </nav>
        `;
    }
}

customElements.define("nav-leiste-garderobe", NavGarderobe);
