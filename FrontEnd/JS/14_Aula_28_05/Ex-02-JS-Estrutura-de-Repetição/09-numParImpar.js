const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let countPar =0;
let countImpar =0;

rl.question('Digite um número inteiro:  ', (number) =>{
    console.log(`Contagem de números pares e ímpares até o número ${number} \n`);
    for(let i = 0; i <= number; i++){
        if(i % 2 == 0){
            countPar++;
        }else if(i % 2 ==1){
            countImpar++;
        }
    }
    console.log(`A quantidade de números pares até o número ${number} é: ${countPar}`);
    console.log(`A quantidade de números ímpares até o número ${number} é: ${countImpar}`);
    rl.close();
})