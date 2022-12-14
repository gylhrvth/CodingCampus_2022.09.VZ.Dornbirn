
// Hello World
let text="Hallo Viktor"
console.log(text);
console.log(" ");

//Gerade-ungerade Zahlen von 1 bis 20
for(let i=1; i <= 20; i++){
    if(i%2 == 0){
        console.log(i + " ist gerade");
    }else{
        console.log(i + " ist ungerade");
    }   
}
console.log(" ");


// die Hunderten von 1000 bis 0
for(let j=1000; j >= 0; j = j-100){
    console.log(j);
}
console.log(" ");

function sum(num1,num2){
    console.log("Num1: " + num1);
    console.log("Num2: " + num2);
    let z = num1 + num2;
    console.log("Summe: " + z);
    console.log(" ");
}

sum(100,200);


//Funktion mit zwei Parameter - Welche Nummer ist größer?
function checkWhoIsGreather(num1, num2){
    console.log("Prüf bitte die zwei Nummern (" + num1 + ", " + num2 + ")");

    if (num1 > num2){
        console.log(num1 + " ist größer als " + num2)
    }else if (num1 < num2){
        console.log(num2 + " ist größer als " + num1)
    }else{
        console.log("Die zwei Nummern sind gleich.");
    }
    console.log(" ");
}

checkWhoIsGreather(10,20);
checkWhoIsGreather(20,20);
checkWhoIsGreather(50,100);


//Funktion - Wie heißen die Monate?
function showMonthName(num){

switch (num){
case 1:
    console.log("Der Monat " + num + " heißt Januar.");
    break;
case 2:
    console.log("Der Monat " + num + " heißt Februar.");
    break;
case 3:
    console.log("Der Monat " + num + " heißt März.");
    break;
case 4:
    console.log("Der Monat " + num + " heißt April.");
    break;
case 5:
    console.log("Der Monat " + num + " heißt Mai.");
    break;
case 6:
    console.log("Der Monat " + num + " heißt Juni.");
    break;
case 7:
    console.log("Der Monat " + num + " heißt Juli.");
    break;
case 8:
    console.log("Der Monat " + num + " heißt August.");
    break;
case 9:
    console.log("Der Monat " + num + " heißt September.");
    break;
case 10:
    console.log("Der Monat " + num + " heißt Oktober.");
    break;
case 11:
    console.log("Der Monat " + num + " heißt November.");
    break;
case 12:
    console.log("Der Monat " + num + " heißt Dezember.");
    break;
default:
    console.log(" Die Eingabe " + num + " darf nur im Bereich (1-12) sein!");
    break;
}
console.log(" ");
}

showMonthName(6);


// Anzahl der Wörter in einem Text
function numberOfWords(text){
    
    let count=0;
    let words = text.split(" ");
    
    for(let i = 0; i < words.length; i++){
        count++;
    }

    console.log(text);
    console.log("Anzahl der Wörter: " + count);
}

numberOfWords("Hallo Viktor, wie geht es dir?")


