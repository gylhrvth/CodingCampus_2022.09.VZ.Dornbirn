function createTextNode(text) {
    const textNode = document.createElement("span")
    textNode.innerText = text
    return textNode
}

function createBr() {
    return document.createElement("br")
}

function onButtonClicked() {
    const container = document.getElementById("container")
    container.appendChild(createTextNode("Hallo"))
    container.appendChild(createBr())
}

function onButtonClicked2() {
    const container = document.getElementById("container2")
    const removableElement = createRemovableElement("Can be removed " + container.childNodes.length, container)
    container.appendChild(removableElement)
}

function createRemovableElement(text, container) {
    const div = document.createElement("div")
    div.appendChild(createTextNode(text))
    const button = document.createElement("button")
    button.innerText = "DELETE"
    button.addEventListener("click", () => {
        container.removeChild(div)
    })
    div.appendChild(button)
    return div
}