// When the user scrolls down 20px from the top of the document, slide down the navbar
window.onscroll = function() {scrollFunction()};

function scrollFunction() {

    document.getElementById("navbar").style.top = "-50px";
  
}