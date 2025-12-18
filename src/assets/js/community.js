class CommunityPost {

    constructor(likeButton, commentButton) {
        this.likeButton = likeButton;
        this.commentButton = commentButton;

        this.likes = this.extractNumber(likeButton.innerText);
        this.comments = this.extractNumber(commentButton.innerText);

        this.initEvents();
    }

    extractNumber(text) {
        return parseInt(text.match(/\d+/));
    }

    like() {
        this.likes++;
        this.likeButton.innerText = `Like (${this.likes})`;
        this.likeButton.classList.add("active");
    }

    comment() {
        alert("Comment-Funktion kommt später 🙂");
    }

    initEvents() {
        this.likeButton.addEventListener("click", () => this.like());
        this.commentButton.addEventListener("click", () => this.comment());
    }
}

document.addEventListener("DOMContentLoaded", () => {

    const likeButtons = document.querySelectorAll(".community_like");
    const commentButtons = document.querySelectorAll(".community_comment");

    for (let i = 0; i < likeButtons.length; i++) {
        new CommunityPost(likeButtons[i], commentButtons[i]);
    }

});
