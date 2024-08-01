function fibonacci(numero){
    let primeiroTermo = 0;
    let segundoTermo = 1;
    let soma;

    let nEsimo;

    for(let i = 1; i <= numero; i++){
        if(i == numero){
            nEsimo = primeiroTermo;
        }
        soma = primeiroTermo + segundoTermo;
        primeiroTermo = segundoTermo;
        segundoTermo = soma;
        
    }
    return nEsimo;
}

let nEsimo = 11;
console.log(`O ${nEsimo}-ésimo número da sequência de Fibonacci é: ${fibonacci(nEsimo)}`);
