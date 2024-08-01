const ps = require("prompt-sync");
const prompt = ps();

let nota;
let peso;
let multiplicacao=0;
let somaNota =0;
let somaPeso =0;

for(i = 0; i < 5; i++){
    nota = parseFloat(prompt("Digite a nota do aluno: "));
    peso = parseFloat(prompt("Digite o peso para essa nota: "));

    multiplicacao = nota * peso;
    // console.log(multiplicacao);
    somaNota += multiplicacao;
    // console.log(somaNota);
    somaPeso += peso
    // console.log(somaPeso);
}
console.log("");
console.log(`A média Ponderada é: ${somaNota/somaPeso}`);
