console.log("js file imported!")

let firstname = "Berna"
let lastname = 'Köchle'
console.log(firstname, lastname)
//this is a comment
//declare 2 variables and calulate the sum
let a, b, c;
a = 5;
b = 3;

for (let i = 0; i < 5; i++) {
    console.log("i can caluculate:", a, "+", b, "*", i)
    console.log("result: ", c = a + (b * i));
}

console.log("let´s write the results into an array and sort it...")
const arr = [];
for (let i = 0; i < 5; i++) {
    console.log("you're in the loop honey")
    arr[i] = a + (b * i);
    console.log("the new array is: ", arr)
}

//Objects use names to access its "members".
const obj1 = { firstName: firstname, lastName: lastname, arrLength: arr.length };
console.log(obj1.firstName.toUpperCase(), obj1.lastName.toLowerCase(), "arraylength:", obj1.arrLength)

//try a function
function babyfunction(a) {
    for(let i = 0; i < 5;++i){
        b= a+i;
    }
    //console.log("babyfunction (",a,") result = ", b)
    return `babyfunction (${a.toFixed(2)}) result = (${b})` //toFixed is numer of digits
}


//babyfunction(9)
console.log(babyfunction(10), "blabla") //


//go to html

let demo2E = document.getElementById('demo2');
demo2E.innerText = "heading created by JS";

let rootE = document.getElementById('root');

//objects have to be handeled different than arrays
//for each
for (const key in obj1) {
    if (Object.hasOwnProperty.call(obj1, key)) {
        const element = obj1[key];

        let paragraphE = document.createElement('p')    //<p></p>
        paragraphE.classList.add('anwenderInfo')    //<p class= ...>
        paragraphE.innerText = `${key}: ${element}` //the content inside p
        rootE.appendChild(paragraphE)
    }
}
/*
let zahl = 0;
let meinZahlE = document.getElementById('meinZahl')
setInterval(() => {
    ++zahl
    meinZahlE.innerText = zahl
}, 1000);
*/

