function comparaNumeros(a, b) {
    const soma = a + b;

    console.log(`Os números ${a} e ${b} ${a === b ? "são" : "não são"} iguais. Sua soma é ${soma}, que é ${soma > 10 ? "maior" : "menor"} que 10 e ${soma > 20 ? "maior" : "menor"} que 20.`);
}

comparaNumeros(1, 2);