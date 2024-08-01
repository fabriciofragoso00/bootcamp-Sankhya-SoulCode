const ps = require("prompt-sync");
const prompt = ps();

let primeiroTermo = 0;
let segundoTermo = 1;
let soma;

let nTermos = prompt("Digite a quantidade de termos: ");

for(let i = 1; i <= nTermos; i++){
    console.log(primeiroTermo);
    soma = primeiroTermo + segundoTermo;
    primeiroTermo = segundoTermo;
    segundoTermo = soma;
    
}