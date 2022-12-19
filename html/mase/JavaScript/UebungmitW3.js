document.getElementById('buttonOn').addEventListener('click', () => {
    turnOn() 
})

//let statusTurnOn = true
setInterval(() => {
    if (statusTurnOn){
        turnOff()
    } else {
        turnOn()
    }
    statusTurnOn = !statusTurnOn
}, 1000)

function turnOn(){
    console.log('turn on')
    var audio = new Audio('../ressources/Light-Switch-On-Off-05-c-FesliyanStudios.com.mp3');
    audio.play();
    document.getElementById('myImage').src='../ressources/pic_bulbon.gif'
}

function turnOff(){
    console.log('turn off')
    var audio = new Audio('../ressources/Light-Switch-On-Off-05-c-FesliyanStudios.com.mp3');
    audio.play();
    document.getElementById('myImage').src='../ressources/pic_bulboff.gif'
}

function myFunction(){
    document.getElementById('demo').innerHTML = 'Paragraph changed'
}

window.onload=function(){
    alert('Aleksandar der kleine');
}


