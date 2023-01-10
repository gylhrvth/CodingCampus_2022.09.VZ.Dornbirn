let clickCount = 0;
function onButtonClicked() {
    clickCount++;
    console.log("Button was clicked" + clickCount)
    const textElement = document.getElementById("clickCount")
    textElement.innerText = clickCount
}