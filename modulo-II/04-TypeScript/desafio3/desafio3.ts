
let botaoAtualizar = document.getElementById('atualizar-saldo') as HTMLElement
let botaoLimpar = document.getElementById('limpar-saldo') as HTMLElement
let soma = document.getElementById('soma') as HTMLInputElement
let campoSaldo = document.getElementById('campo-saldo') as HTMLElement

let saldoTotal = 0

limparSaldo()

function somarAoSaldo(soma: number) {
    saldoTotal += soma
    campoSaldo.innerHTML = saldoTotal.toString()
    limparCampoSoma()
}

function limparCampoSoma() {
    soma.value = ""
}

function limparSaldo() {
    saldoTotal = 0
    campoSaldo.innerHTML = saldoTotal.toString()
}

botaoAtualizar.addEventListener('click', () => {
    somarAoSaldo(Number(soma.value))
})

botaoLimpar.addEventListener('click', () => {
    limparSaldo();
})
