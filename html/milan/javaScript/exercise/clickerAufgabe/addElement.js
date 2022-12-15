let container;

window.onload = () => {
container = document.getElementById("container")
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

