let clickCount = 0;

function onButtonClicked() {
  clickCount++;
  console.log("Button was clicked " + clickCount);
  const textElement = document.getElementById("clickCount");
  textElement.innerText = clickCount;

  textElement.style.fontSize = 20 + clickCount + "px";

  if (clickCount % 2 == 0) {
    textElement.classList.remove("uneven");
    textElement.classList.add("even");
  } else {
    textElement.classList.remove("even");
    textElement.classList.add("uneven");
  }
}
