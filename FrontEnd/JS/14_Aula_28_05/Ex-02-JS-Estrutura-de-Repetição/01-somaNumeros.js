const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let soma =0;

rl.question('Digite um número inteiro  ', (number) => {
    for(let i = 1; i <= number; i++){
        soma+=i;
    }
    rl.close();
    console.log(`A soma de 1 a ${number} é de ${soma}`);
})