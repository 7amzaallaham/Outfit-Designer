class CommunityPost {

    constructor(likeButton, commentButton) {
        this.likeButton = likeButton;
        this.commentButton = commentButton;
        this.liked = false;
    }

    toggleLike() {
        this.liked = !this.liked;
        this.likeButton.classList.toggle("active");

        if (this.liked) {
            this.likeButton.textContent = "Liked ❤️";
        } else {
            this.likeButton.textContent = "Like";
        }
    }

    comment() {
        alert("Comment-Funktion kommt später 🙂");
    }
}

document.addEventListener("DOMContentLoaded", () => {

    const likeButtons = document.querySelectorAll(".community_like");
    const commentButtons = document.querySelectorAll(".community_comment");

    for (let i = 0; i < likeButtons.length; i++) {

        const post = new CommunityPost(
            likeButtons[i],
            commentButtons[i]
        );

        likeButtons[i].addEventListener("click", () => {
            post.toggleLike();
        });

        commentButtons[i].addEventListener("click", () => {
            post.comment();
        });
    }

});
