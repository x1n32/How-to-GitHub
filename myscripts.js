// When the user scrolls down 20px from the top of the document, slide down the navbar
/*window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > -1 ) {
    document.getElementById("navbar").style.top = "0";
  } else {
    document.getElementById("navbar").style.top = "-50px";
  }
}
*/
window.onscroll = function() {stickyScrollFunction()};

var navbar = document.getElementById("navbar");
var sticky = navbar.offsetTop;

function stickyScrollFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}