const ps = require("prompt-sync");
const prompt = ps();

let number1 = parseInt(Math.random() * 100) + 1;
// console.log(number1);
let number2 = prompt("Digite um numero entre 1 e 100: ");
while(number1 != number2){
    if(number1 > number2){
      console.log("O número escolhido é maior que o seu!");
    }else{
      console.log("O número escolhido é menor que o seu!");
    }

    number2 = prompt("Errou! Tente Novamente: ");
}

console.log(`Voçê adivinhou o numero! ${number1} = ${number2}`)



