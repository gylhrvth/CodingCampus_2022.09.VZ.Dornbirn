let text = "Apfel"
console.log(text + " Länge: " + text.length)

// Slice - Endposition ist nicht inkludiert, also nur von 0 bis 10 wird der Substring angezeigt
let text2="Hello World, wie geht es dir, WORLD?"
console.log(text2.slice(5,11))

//Slice nur mit einem Parameter -> Startpos. bis zum Ende des Strings
console.log(text2.slice(10))

console.log(text2.substr(5,6))

console.log(text2.replace("Hello","Grüß Gott"))

// ReplaceAll with case insensitive 
let text3=text2.replaceAll(/WORLD/g,"Welt")
console.log(text3.replaceAll(/World/g,"Welt"))
console.log(" ")

let text4="    [Hello World!]    "

console.log(text4 + "\n" +"Using of trim(): ")
console.log("trim: " + text4.trim())
console.log("trimEnd: " + text4.trimEnd())

let text5="AT5800 6000 "

console.log("padEnd: " + text5.padEnd(27,"x"))

let text6="Return the position of the first occurrence of a string in a string:"
console.log("search: " + text6.search("the"))

console.log("includes: " + text6.includes("the",30))

console.log("startsWith: " + text6.startsWith("Return"))

console.log("endsWith: " + text6.endsWith(":"))


//Object
let person = {firstName:"John", lastName:"Doe", age:"50"} 
console.log(person)
console.log(person.lastName)

//Array

let array = new Array()
array[0] = "Peter"
array[1] = 150
array[2] = "AT5800 6000 5000 4000"

console.log(array)

//Min, Max in einem Array
let numbers = new Array(1000000000,200,300,400,500,600,700,800,900,1000)

function getMin(array){
    let min = array[0]
    for(let i=1; i < array.length; i++){
        if (min > array[i])
        {
            min = array[i]
        }
    }
    return min;
}

function getMax(array){
    let max = array[0]

    for(let i= 0; i < array.length; i++){
        if (max < array[i])
        {
            max = array[i]
        }
    }
    return max;
}
//Alternative -> Math.min.apply/ Math.max.apply
function getMinWithMathMaxApply(array)
{
    return Math.min.apply(null, array)
}

function getMaxWithMathMaxApply(array)
{
    return Math.max.apply(null, array)
}

console.log("Reverse: " + numbers.reverse())
console.log("Min: " + getMin(numbers))
console.log("Max: " + getMax(numbers))
console.log("Min with Math.min.apply: " + getMinWithMathMaxApply(numbers))
console.log("Max with Math.max.apply: " + getMaxWithMathMaxApply(numbers))
console.log(" ")



//Array with objects - Sorting on name is not working
let peoples = [
    { fname: "Daniel", age: 30, Address: "Street 100" },
    { fname: "Adam", age: 35, Address: "Street 300" },
    { fname: "Bjorn", age: 2, Address: "Street 200" },
];


console.log("Sortierung nach Name: ")
peoples.sort((x, y) => x.fname.localeCompare(y.fname))
console.log(peoples)
console.log(" ")

//Sorting on age
console.log("Sortierung nach \"Age\"")
peoples.sort((x, y) => x.age - y.age)
console.log(peoples)



// function map()
 let pers = {
    name: "John",
    age: 25,
    school: ["High school","University","Cours"]
 }

 pers.school.sort()
pers.school = [...pers.school, "Master Cours"]

console.log(pers)

let schoolLength = pers.school.map(item => item.length)
console.log("Länge der Ausbildungsnamen", schoolLength) 

console.log(pers.school)

// String Array -> sorting

let lands = ["Österreich","Belgien","Ukraine","Malta"]
console.log(lands.sort((x,y) => x.localeCompare(y)))

//Date - von 0 (Januar) bis 11 (Dezember)
const date = new Date()
const months = ["Januar","Februar","March","April","Mai","Jun","Juli","August","September","Oktober","November","Dezember"]
console.log("Der aktuelle Monat: " + months[date.getMonth()])

//Days
const dateOfToday = new Date()
let value = dateOfToday.getDay()
console.log("Value of getDay(): " + value)
switch(value){
    case 0: console.log("Heute ist Sonntag")
    break
    case 1: console.log("Heute ist Montag")
    break
    case 2: console.log("Heute ist Dienstag")
    break
    case 3: console.log("Heute ist Mittwoch")
    break
    case 4: console.log("Heute ist Donnerstag")
    break
    case 5: console.log("Heute ist Freitag")
    break
    case 6: console.log("Heute ist Samstag")
    break
}

























