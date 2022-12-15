const CLICK_COUNT = "clickCount"
const ELEMENT = "element"
const REMOVABLE_ELEMENT = "removableElement"

function saveElementText(text) {
    let elements = localStorage.getItem(ELEMENT)
    if (!elements) {
        elements = []
    } else {
        elements = JSON.parse(elements)
    }
    elements.push(text)
    localStorage.setItem(ELEMENT, JSON.stringify(elements))
}

function saveRemovableElementText(text) {
    let elements = localStorage.getItem(REMOVABLE_ELEMENT)
    if (!elements) {
        elements = []
    } else {
        elements = JSON.parse(elements)
    }
    elements.push(text)
    localStorage.setItem(REMOVABLE_ELEMENT, JSON.stringify(elements))
}

function removeRemovableElementText(text) {
    let elements = localStorage.getItem(REMOVABLE_ELEMENT)
    if (!elements) {
        return
    }
    elements = JSON.parse(elements)
    const index = elements.indexOf(text)
    if (index != -1) {
        elements.splice(index, 1)
        localStorage.setItem(REMOVABLE_ELEMENT, JSON.stringify(elements))
    }
}

function getRemovableElementsText() {
    let elements = localStorage.getItem(REMOVABLE_ELEMENT)
    if (!elements) {
        return []
    }
    return JSON.parse(elements)
}

function increaseClickCount() {
    let currentClickCount = localStorage.getItem(CLICK_COUNT)
    if (!currentClickCount) {
        currentClickCount = 1
    } else {
        currentClickCount++
    }
    localStorage.setItem(CLICK_COUNT, currentClickCount)
}

function getClickCount() {
    return localStorage.getItem(CLICK_COUNT) | 0
}