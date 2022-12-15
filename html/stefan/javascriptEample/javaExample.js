
    console.log("Import ist erfolgreich")

    const car=  {
    Hersteller: "Skoda",
    Marke: "noName",
    age: 12 ,
    color:"blue",
    Ps:120,
    engine:"benzin"

    }
    console.log(car)
    console.log(car.Hersteller)

        
    const person={
        Namen: ['Stefan','Peter','Lauch'],
        Nachname: ['Kaiser','Milch','Garten'],
        age: ['20','6','45'],

    
    }
   
    
    
    let rootE = document.getElementById('root')
    let h1E = document.createElement('h1')
    h1E.innerText = 'Namen'
    
    rootE.appendChild(h1E)
    
   
   
    for(let i=0; i < person.Namen.length; ++i){
        let pE = document.createElement('p')
        pE.innerText = person.Namen[i]
        rootE.appendChild(pE)
        pE.classList.add('changecolor', 'colorBlue')
  
    }


function myfunction(){
    let text =document.getElementById("button").innerHTML;
    let buttonE = document.getElementById("button")
    buttonE.innerHTML = "Nooooo"
    buttonE.classList.add('drama')

    addCarManufacture()
}


function addCarManufacture(){
    let newParagraph = document.createElement('p')
    newParagraph.innerText = car.Hersteller
    
    document.getElementById('root').appendChild(newParagraph)
}

function changeColors(){
    /*
    for (const iterator of document.getElementsByClassName('changecolor')) {
        iterator.classList.toggle('colorBlue')
    }
    */
   Array.from(document.getElementsByClassName('changecolor')).forEach(elemenet => {
    elemenet.classList.toggle('colorBlue')
   })
}


function carText(){
let txt="";
for(let x in car){
    txt+=car[x]+" "+"<br>";
   
    document.getElementById('text').innerHTML=txt;

}
}
const fruits =
    ["Banana","Orange", "Apple", "Mango"]


function printfruits(fruits) {
 
    fruits.sort()
    document.getElementById('text').innerHTML=fruits;
   

}
function date() {
    let d = new Date()
    document.getElementById('text').innerHTML=d;
}


function addfruits(fruits) {
    fruits.push("Lemon");
document.getElementById("text").innerHTML = fruits;
}