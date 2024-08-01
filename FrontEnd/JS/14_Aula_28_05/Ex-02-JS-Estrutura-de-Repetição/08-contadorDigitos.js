const ps = require("prompt-sync");
const prompt = ps();

let numero =parseInt(prompt("Digite um número: "));
let varAux =numero;
let count =0;

while(numero != 0){
    numero = parseInt(numero/10);
    // console.log(numero);
    count++;
}

console.log(`O número ${varAux} possui ${count} dígitos`);