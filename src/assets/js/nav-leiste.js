class NavLeiste extends HTMLElement {        //um copy-paste zu vermeiden jetzt die navLeiste als Web-Component
    
    connectedCallback() {
        const aktiv = this.getAttribute("aktiv");

        this.innerHTML = `
            <nav class="navLeiste">
                <a href="community-profil.html" class="tab ${aktiv === 'community' ? 'tab_aktiv' : ''}">
                    Community
                </a>
                <a href="garderobe-outfits.html" class="tab ${aktiv === 'garderobe' ? 'tab_aktiv' : ''}">
                    Garderobe
                </a>
                <a href="neuesOutfit.html" class="tab ${aktiv === 'neuesOutfit' ? 'tab_aktiv' : ''}">
                    Neues Outfit
                </a>
            </nav>
        `;
    }
}

customElements.define("nav-leiste", NavLeiste);