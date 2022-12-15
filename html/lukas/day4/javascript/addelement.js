let container;

window.onload = () => {
    container = document.getElementById("container")
    updateClickCount()
    initRemovableElements()
}

function initRemovableElements() {
    const container = document.getElementById("container2")
    for (let removableElementText of getRemovableElementsText()) {
        const removableElement = createRemovableElement(removableElementText, container)
        container.appendChild(removableElement)
    }
}

function createTextNode(text) {
    const textNode = document.createElement("span")
    textNode.innerText = text
    return textNode
}

function createBr() {
    return document.createElement("br")
}

function onButtonClicked() {
    const text = "Hallo"
    container.appendChild(createTextNode(text))
    container.appendChild(createBr())
    saveElementText(text)
    increaseClickCount()
    updateClickCount()
}

function onButtonClicked2() {
    const container = document.getElementById("container2")
    const text = "Can be removed " + container.childNodes.length;
    const removableElement = createRemovableElement(text, container)
    container.appendChild(removableElement)
    saveRemovableElementText(text)
    increaseClickCount();
    updateClickCount();
}

function updateClickCount() {
    const clickCountDiv = document.getElementById("clickCount")
    clickCountDiv.innerText = getClickCount()
}

function createRemovableElement(text, container) {
    const div = document.createElement("div")
    div.appendChild(createTextNode(text))
    const button = document.createElement("button")
    button.innerText = "DELETE"
    button.addEventListener("click", () => {
        container.removeChild(div)
        removeRemovableElementText(text)
    })
    div.appendChild(button)
    return div
}