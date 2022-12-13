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





