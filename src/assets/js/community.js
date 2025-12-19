// LIKE BUTTON
document.querySelectorAll(".community_like").forEach(button => {
    button.addEventListener("click", () => {
        const countSpan = button.querySelector(".like_count");
        let count = parseInt(countSpan.textContent);
        countSpan.textContent = count + 1;
    });
});

// COMMENT BUTTON
document.querySelectorAll(".community_comment").forEach(button => {
    button.addEventListener("click", () => {
        const card = button.closest(".outfit_karte");
        const commentBox = card.querySelector(".comment_box");
        commentBox.classList.toggle("hidden");
    });
});
