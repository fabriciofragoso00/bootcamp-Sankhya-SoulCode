const ps = require("prompt-sync");
const prompt = ps();

let nota;
let sair;
let somaNota =0;
let countNota =0;


while(sair != 'y'){
    nota = parseFloat(prompt("Digite a nota do aluno: "));
    somaNota+=nota;
    countNota++;
    console.log(somaNota);

    sair = prompt("Deseja parar? y/n ");
}

console.log(`A média desse aluno é ${somaNota/countNota}`);