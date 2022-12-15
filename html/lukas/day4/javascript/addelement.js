//We cannot initialize the container here, as it is not yet in the dom
let container;

window.onload = () => {
    //This method gets called when page load is finished
    //Now we can access the container element
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
    //At first we create a div element
    const div = document.createElement("div")
    //Then we append a text node as child
    div.appendChild(createTextNode(text))
    //Now we create button and add an event listener
    const button = document.createElement("button")
    button.innerText = "DELETE"
    button.addEventListener("click", () => {
        //Removes the div container from the parent container
        container.removeChild(div)
        //We remove the text from localstorage
        removeRemovableElementText(text)
    })
    //Button is appended to the div container
    div.appendChild(button)
    return div
}