let numero = parseInt(Math.random() * 3);

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.question('Ativar Cheat? y/n  ', (cheat) => {
    if(cheat === 'y'){
        console.log('cheat active! Número escolhido é: ' + numero);
    }else if(cheat === 'n'){
        console.log('cheat disabled!');
    }else{
        console.log("invalid cheat");
    }
    rl.question('Voçê possui duas oportunidade, Adivinhe um numero de 0 a 3  ', (numeroChute) => {
        if(numero != numeroChute){2
            if(numero >= 0 && numero <=1){
                console.log("O número está entre 0 e 1");
                rl.question('Voçê possui apenas mais uma oportunidade, Adivinhe um número  ', (numeroChute) => {
                    if(numero != numeroChute){
                        console.log(`Errou! Game Over, o número era ${numero}`);
                        
                    }else{
                        console.log(`${numeroChute} = ${numero}, você acertou!`);
                    }
                rl.close();
                });

            }else if(numero > 2 && numero <=3){
                console.log("O numero esta entre 2 e 3");
                rl.question('Voçê possui apenas mais uma oportunidade, Adivinhe um numero  ', (numeroChute) => {
                    if(numero != numeroChute){
                        console.log(`Errou! Game Over, o número era ${numero}`);
                        
                    }else{
                        console.log(`${numeroChute} = ${numero}, você acertou!`);
                    }
                rl.close();
                });
            }
        }else{
            console.log(`${numeroChute} = ${numero}, você acertou!`);
            rl.close();
        }  
    });
});

