const filterButton = document.querySelector(".filter_button");
const filterPopup = document.getElementById("filterPopup");

filterButton.addEventListener("click", function(e) {
    filterPopup.classList.toggle("aktiv"); 
});