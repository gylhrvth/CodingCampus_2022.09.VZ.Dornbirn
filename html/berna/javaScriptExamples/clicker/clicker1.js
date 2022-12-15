console.log("js script was loaded")

let nrClicks = 0

function countClicks() {
nrClicks++
console.log("there was a click")
const nr = document.getElementById("click_count")
nr.innerText = nrClicks
console.log("click counter updated", nrClicks)
}
