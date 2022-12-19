let counter = 0
setInterval(() => {
    let container = document.getElementById('bigimgContainer')

    //console.log("Hello", counter % container.children.length)
    for (let i = 0; i < container.children.length; ++i) {
        if (i == counter % container.children.length) {
            container.children[i].classList.add('imageVisible')
        } else {
            container.children[i].classList.remove('imageVisible')
        }
    }
    ++counter
}, 2000)