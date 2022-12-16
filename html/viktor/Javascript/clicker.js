
let container;

window.onload = () => {
    container = document.getElementById("container")
    updateClickCount()
}



function onButtonClicked(){
    increaseClickCount()
    updateClickCount()
}

function onClickToReset(){
    setToNull()
    updateClickCount()
}

function createDateNode(date){
    const dateNode = document.createElement("span")
    dateNode.innerText = date
    return dateNode

}

function createBr(){
    return document.createElement("br")
}

function onButtonClicked2(){
    const div = document.createElement("div")
    const date = new Date()
    const dateutc= date.toUTCString()
    div.appendChild(createDateNode(dateutc))
    div.appendChild(createBr())
    container.appendChild(div)
    
}

function onButtonClicked4(){
const div1 = document.getElementById("container")
div1.innerHTML=" "
}

function onButtonClicked3(){
    const cont = document.getElementById("container2")
    const date = new Date()
    const dateUTC = date.toUTCString()
    const removableElement = createRemElement(dateUTC,cont)
    cont.appendChild(removableElement)
}

function createRemElement(date,cont){

    const div = document.createElement("div")
    div.appendChild(createDateNode(date))
    const button = document.createElement("button")
    button.innerText = "Delete"
    button.addEventListener("click", () => {cont.removeChild(div)})
    div.appendChild(button)
    return div
}


function updateClickCount(){
    const clickCountDiv = document.getElementById("clickCount")
    clickCountDiv.innerText = getClickCount()
}

