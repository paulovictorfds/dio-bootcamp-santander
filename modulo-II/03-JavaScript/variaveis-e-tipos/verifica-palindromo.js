function verificaPalindromo(palavra) {
    if (!palavra) return "palavra inexistente";

    return palavra.split("").reverse().join("") === palavra;
}

function verificaPalindromo2(palavra) {
    if (!palavra) return "palavra inexistente";

    for (let i = 0; i < (palavra.length / 2); i++) {
        if (palavra[i] !== palavra[palavra.length - 1 - i]) {
            return false;
        }
    }
    return true;
}

let meuObjeto = {
    chave: 'valor'
}
   
console.log(meuObjeto.chave); 
console.log(meuObjeto["chave"]);


console.log(verificaPalindromo2("gema"));