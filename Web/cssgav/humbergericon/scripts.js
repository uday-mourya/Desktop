const hamburgerMenu = document.getElementById("hamburger-menu");
const offcanvas = document.getElementById("offcanvas");

hamburgerMenu.addEventListener("click", () => {
    offcanvas.classList.toggle("active");
});
