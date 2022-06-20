var currentNumberWrapper = document.getElementById('currentNumber');
var currentNumber = 0;

function increment() {
    if (currentNumber < 10) {
        currentNumber += 1;
    }
    currentNumberWrapper.innerHTML = currentNumber;
}

function decrement() {
    if (currentNumber > 0) {
        currentNumber -= 1;
    }
    currentNumberWrapper.firstChild.nodeValue = currentNumber;
}

var botaoAdicionar = document.getElementById('addButton');
botaoAdicionar.addEventListener("click", increment, false);

var botaoAdicionar = document.getElementById('subButton');
botaoAdicionar.addEventListener("click", decrement, false);