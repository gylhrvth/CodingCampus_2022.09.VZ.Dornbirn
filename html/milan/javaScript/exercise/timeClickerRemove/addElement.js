let container;

window.onload = () => {
    container = document.getElementById("currentTime")
}

function onButtonClicked() {
    let p = createRow(container, 'p', createText() + createTimeNode())
    let button = createRow(p, 'button', 'Remove')
    button.classList.add('buttonInBlock')
    button.addEventListener("click", () => {
            container.removeChild(p)
        }
    )
}

function createRow(parent, elementType, text) {
    const rowInput = document.createElement(elementType)
    rowInput.innerText = text
    parent.appendChild(rowInput)
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

