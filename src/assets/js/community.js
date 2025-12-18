class CommunityPost {

    constructor(likeButton, commentButton, commentsBox) {
        this.likeButton = likeButton;
        this.commentButton = commentButton;
        this.commentsBox = commentsBox;
        this.liked = false;
    }

    toggleLike() {
        this.liked = !this.liked;
        this.likeButton.classList.toggle("active");

        this.likeButton.textContent = this.liked ? "Liked ❤️" : "Like";
    }

    addComment() {
        const text = prompt("Schreibe deinen Kommentar:");

        if (text && text.trim() !== "") {
            const comment = document.createElement("p");
            comment.textContent = text;
            this.commentsBox.appendChild(comment);
        }
    }
}

document.addEventListener("DOMContentLoaded", () => {

    const likeButtons = document.querySelectorAll(".community_like");
    const commentButtons = document.querySelectorAll(".community_comment");
    const commentBoxes = document.querySelectorAll(".comments");

    for (let i = 0; i < likeButtons.length; i++) {

        const post = new CommunityPost(
            likeButtons[i],
            commentButtons[i],
            commentBoxes[i]
        );

        likeButtons[i].addEventListener("click", () => {
            post.toggleLike();
        });

        commentButtons[i].addEventListener("click", () => {
            post.addComment();
        });
    }
});
