
console.log("Import ist erfolgreich")


let vorname = "Gyula"
let nachname = 'Horvath'
console.log(vorname, nachname)

let value = 3
let valueText = '3'

let vorname2 = "Gyula"

console.log(vorname, nachname, (vorname == nachname))
console.log(vorname, vorname2, (vorname == vorname2))
console.log(vorname, vorname2, (vorname === vorname2))


console.log(valueText, value, (valueText == value))
console.log(valueText, value, (valueText === value))

let person = {
  name: 'Gyula',
  urlaubstage: 100,
  gehalt: 100,
  ausbildung: ['Kindergarten', 'Volksschule', 'Mittelschule']
}

person.ausbildung.sort()
person.ausbildung = [...person.ausbildung, "Gymnasium"]

let lengtList = person.ausbildung.map( item => item.length)  

console.log("lengtList", lengtList)

console.log(person)
console.log(person.urlaubstage)
console.log(person.ausbildung[0])

let rootE = document.getElementById('root')
let h1E = document.createElement('h1')
h1E.innerText = 'Meine Ausbildung'
rootE.appendChild(h1E)
for (let i = 0; i < person.ausbildung.length; i++){
  let pE = document.createElement('p')
  pE.innerText = person.ausbildung[i]
  if (person.ausbildung[i] == 'Gymnasium') {
    pE.classList.add('redHearing')
  }

  rootE.appendChild(pE)
}
