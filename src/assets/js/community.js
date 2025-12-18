document.addEventListener("DOMContentLoaded", () => {

    const likeButtons = document.querySelectorAll(".community_like");

    likeButtons.forEach(button => {
        button.addEventListener("click", () => {

            let text = button.innerText;        
            let number = parseInt(text.match(/\d+/)); 

            number++;

            button.innerText = `Like (${number})`;
        });
    });


    const commentButtons = document.querySelectorAll(".community_comment");

    commentButtons.forEach(button => {
        button.addEventListener("click", () => {
            alert("Comment-Funktion kommt später 🙂");
        });
    });

});
