const ps = require("prompt-sync");
const prompt = ps();

let fatorial = prompt("Digite um número inteiro não negativo: ");
let aux = fatorial;
console.log(`Fatorial do número ${fatorial}`);
for(let i=fatorial-1; i>=1; i--){
    // console.log(i);
    aux= aux *i;
}

console.log(aux);