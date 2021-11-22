

/*
// When the user scrolls the page, execute myFunction
window.onscroll = function() {stickyScrollFunction()};

// Get the navbar
var navbar = document.getElementById("navbar");

// Get the offset position of the navbar
var sticky = navbar.offsetTop;

// Add the sticky class to the navbar when you reach its scroll position. Remove "sticky" when you leave the scroll position
function stickyScrollFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
} 
*/

function sidebar_open() {
  document.getElementById("sidebar").style.display = "block";
}

function sidebar_close() {
  document.getElementById("sidebar").style.display = "none";
}


const date = new Date();
const currentYear = date.getFullYear();
const today = date.getDate();
const currentMonth = date.getMonth() + 1; //runs from 0 to 11, that's why we add 1
const timeElapsed = Date.now();
const today = new Date(timeElapsed);
today.toDateString();

function formatDate(date, format) {
  const map = {
      mm: date.getMonth() + 1,
      dd: date.getDate(),
      yy: date.getFullYear().toString().slice(-2),
      yyyy: date.getFullYear()
  }
  return format.replace(/mm|dd|yy|yyy/gi, matched => map[matched])
}

document.getElementById("date").innerHTML = today;
document.getElementById("date2").innerHTML = formatDate(date, dd/mm/yyyy);