
let container;

window.onload = () => {
  container = document.getElementById("container");
 
};



function createTextNode(text) {
  const textNode = document.getElementById("container").innerHTML = Date();
  textNode.innerText = Date();
  return Date;
}

function createBr() {
  return document.createElement("br");
}

function onButtonClicked() {
  const text = Date();
  container.appendChild(createTextNode(Date()));
  container.appendChild(createBr());
 
  return Date()
}
