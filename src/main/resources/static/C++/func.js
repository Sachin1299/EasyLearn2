




window.onscroll = function () { myFunction() };
var header = document.getElementById("asidebar");
var sticky = header.offsetTop;


function myFunction() {

    if (window.pageYOffset > sticky) {
        header.classList.add("sticky");
        header.style.position = "fixed";
        if ((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {
            header.classList.add("newheight");
        }
        else {
            header.classList.remove("newheight");
        }
    }

    else {
        header.classList.remove("sticky");
    }
};

function mouseevent() {
    var but = document.getElementById("prev");
    but.style.backgroundColor = "aqua";
    but.style.color = "black";



};

function mouseleave() {
    var but = document.getElementById("prev");
    but.style.backgroundColor = "white";
    but.style.color = "blue"


};
function mouseevent1() {
    var but = document.getElementById("next");
    but.style.backgroundColor = "aqua";
    but.style.color = "black";



};

function mouseleave1() {
    var but = document.getElementById("next");
    but.style.backgroundColor = "white";
    but.style.color = "blue"


};
