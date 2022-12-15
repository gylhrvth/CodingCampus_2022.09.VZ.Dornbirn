let container;

window.onload = () => {
    container = document.getElementById("currentTime")
}

function onButtonClicked() {
    container.appendChild(createRow())
    container.appendChild(createButton())
}

function createButton() {
    const button = document.createElement("button")
    button.innerText = "Remove"
    /*
    button.onclick = () => {
    
    }
    */
    return button
}

function createRow() {
    const rowInput = document.createElement("p")
    const text = createText()
    const date = createTimeNode()
    rowInput.innerText = text + " " + date
    return rowInput
}

function createText() {
    const text = "Clicked at: "
    return text
}

function createTimeNode() {
    today = new Date().toString()
    return today
}
