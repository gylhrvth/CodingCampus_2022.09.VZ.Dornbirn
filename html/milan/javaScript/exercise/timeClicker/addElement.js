let container;

window.onload = () => {
container = document.getElementById("currentTime")
}

function onButtonClicked() {
    container.appendChild(createRow())
   
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
    /*
    var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
    var yyyy = today.getFullYear();
    today = dd + '.' + mm + '.' + yyyy;
    */
    today = new Date().toString()
    return today
}
