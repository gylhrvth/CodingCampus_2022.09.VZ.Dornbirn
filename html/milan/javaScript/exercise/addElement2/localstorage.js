const CLICK_COUNT = "clickCount"

function increaseClickCount() {
    let currentClickCount = localStorage.getItem(CLICK_COUNT)
    if (!currentClickCount) {
        currentClickCount = 1
    } else {
        currentClickCount++
    }
    localStorage.setItem(CLICK_COUNT, currentClickCount)
}

function getClickCount() {
    return localStorage.getItem(CLICK_COUNT) | 0;
    /*
    const clickCount = localStorage.getItem(CLICK_COUNT);
    if (clickCount != undefined){
        return clickCount
    } else {
        return 0
    }
    */
}