const CLICK_COUNT = "clickCount"
const ELEMENT = "element"
const REMOVABLE_ELEMENT = "removableElement"

function saveElementText(text) {
    let elements = localStorage.getItem(ELEMENT)
    if (!elements) {
        //If ELEMENT is not defined in localStorage initialize it with an empty array
        elements = []
    } else {
        //ELEMENT is stored as a string in localStorage, so it has to be parsed to JavaScript objects
        elements = JSON.parse(elements)
    }
    //Add element to array via push
    elements.push(text)
    //JSON.stringify converts the JavaScript Object to an array
    localStorage.setItem(ELEMENT, JSON.stringify(elements))
}

function saveRemovableElementText(text) {
    let elements = localStorage.getItem(REMOVABLE_ELEMENT)
    if (!elements) {
        //If ELEMENT is not defined in localStorage initialize it with an empty array
        elements = []
    } else {
        //ELEMENT is stored as a string in localStorage, so it has to be parsed to JavaScript objects
        elements = JSON.parse(elements)
    }
    //Add element to array via push
    elements.push(text)
    //JSON.stringify converts the JavaScript Object to an array
    localStorage.setItem(REMOVABLE_ELEMENT, JSON.stringify(elements))
}

function removeRemovableElementText(text) {
    let elements = localStorage.getItem(REMOVABLE_ELEMENT)
    //If ELEMENT is not defined in localStorage return immediately
    if (!elements) {
        return
    }
    elements = JSON.parse(elements)
    //Search element
    const index = elements.indexOf(text)
    if (index != -1) {
        //If found remove the element from the array
        elements.splice(index, 1)
        //JSON.stringify converts the JavaScript Object to an array
        localStorage.setItem(REMOVABLE_ELEMENT, JSON.stringify(elements))
    }
}

function getRemovableElementsText() {
    let elements = localStorage.getItem(REMOVABLE_ELEMENT)
    //If ELEMENT is not defined in localStorage return immediately
    if (!elements) {
        return []
    }
    //ELEMENT is stored as a string in localStorage, so it has to be parsed to JavaScript objects
    return JSON.parse(elements)
}

function increaseClickCount() {
    let currentClickCount = localStorage.getItem(CLICK_COUNT)
    //If ELEMENT is not defined in localStorage define currentClickCount as 1
    if (!currentClickCount) {
        currentClickCount = 1
    } else {
        //Increase click count
        //The actual type of currentClickCount is a string,
        //increasing with ++ works
        currentClickCount++
    }
    localStorage.setItem(CLICK_COUNT, currentClickCount)
}

function getClickCount() {
    //Returne click count, if it is undefined, 0 is returned
    return localStorage.getItem(CLICK_COUNT) | 0
}