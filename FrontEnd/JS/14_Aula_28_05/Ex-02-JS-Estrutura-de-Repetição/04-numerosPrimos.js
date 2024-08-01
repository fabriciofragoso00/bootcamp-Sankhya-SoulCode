const ps = require("prompt-sync");
const prompt = ps();

let numero = prompt("digite um numero: ");
let primo;

console.log(`Números primos até o número ${numero}!` );

for(let i=2; i<=numero; i++){
    primo = true;
    for(let j=2; j<i; j++){
        if(i % j==0){
            primo = false;
        }
    }
    if(primo){
        console.log(i);
    }
}