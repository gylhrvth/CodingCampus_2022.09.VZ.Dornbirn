console.log("Import was successful")


let fristname = "Batuhan"
let lastname = "Danisment"
console.log(fristname,lastname)

let value = 3
let valueText = "3"

let fristname2 = "Batuhan"

console.log(fristname, lastname, (fristname == lastname))
console.log(fristname, fristname2, (fristname == fristname2))
console.log(fristname, fristname2, (fristname === fristname2))


console.log(valueText, value, (valueText == value))
console.log(valueText, value, (valueText === value))

let person = {
    name: 'Batuhan',
    holidays: 100,
    salary: 2000,
    education: ['kindergarten', 'elementaryschool', 'middleschool']
}

person.education.sort()
person.education = [...person.education, "Berufschule"]

let lengtList = person.education.map( item => item.length)

console.log("lengthList", lengtList)

console.log(person)
console.log(person.holidays)
console.log(person.salary[0])

let rootE = document.getElementById('root')
let h1E = document.createElement('h1')
h1E.innerText = 'My Education'
rootE.appendChild(h1E)
for (let i = 0; i < person.education.length; i++) {
    let pE = document.createElement('p')
    pE.innerHTML = person.education[i]
    if (person.education[i] == 'Berufschule') {
        pE.classList.add('redHearing')
    }
    rootE.appendChild(pE)
    
}