let count = 0

function onButtonClicked(){
    count++
    console.log('Button was clicked'+ count)
    document.getElementById('clickedTimes').innerText=count
    localStorage.setItem('clickedTimes',count)
}
