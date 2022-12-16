let container;

window.onload = () => {
updateClickCount()
}

function onButtonClicked() {
    increaseClickCount()
    updateClickCount()
}

function updateClickCount() {
    const clickCountDiv = document.getElementById("clickCount")
    clickCountDiv.innerText = getClickCount()
}

