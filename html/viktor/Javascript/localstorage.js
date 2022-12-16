const CLICK_COUNT = "clickCount" 



function increaseClickCount(){
let clickCurrentCount = localStorage.getItem(CLICK_COUNT)

if (!clickCurrentCount){
    clickCurrentCount = 1
} else {
    clickCurrentCount++;
}
localStorage.setItem(CLICK_COUNT, clickCurrentCount)

}

function setToNull(){
    localStorage.setItem(CLICK_COUNT, 0)
}

function getClickCount(){
return localStorage.getItem(CLICK_COUNT) | 0
 }