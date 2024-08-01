const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite um número inteiro entre 0 e 10  ', (number) =>{
    console.log(`Tabuada do número ${number}!`);
    for(let i = 1; i <= 10; i++){
        console.log(`${number} x ${i} = ${number * i}`);
    }
    rl.close();
})