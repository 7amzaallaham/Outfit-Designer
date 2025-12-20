class NavCommunity extends HTMLElement {      //sekundäre NavLeiste in der Community

    connectedCallback() {
        const aktiv = this.getAttribute("aktiv");

        this.innerHTML = `
            <nav class="navLeiste">
                <a href="community-profil.html" class="tab ${aktiv === 'profil' ? 'tab_aktiv' : ''}">
                    Mein Profil
                </a>
                <a href="community-entdecken.html" class="tab ${aktiv === 'entdecken' ? 'tab_aktiv' : ''}">
                    Entdecken
                </a>
                <a href="community-merkliste.html" class="tab ${aktiv === 'merkliste' ? 'tab_aktiv' : ''}">
                    Merkliste
                </a>
            </nav>
        `;
    }
}

customElements.define("nav-leiste-community", NavCommunity);
