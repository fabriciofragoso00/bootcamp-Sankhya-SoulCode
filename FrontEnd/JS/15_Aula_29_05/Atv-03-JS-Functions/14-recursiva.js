function recursiva(numero){
    console.log(numero);
    numero--;

    if(numero>=0){
        recursiva(numero);
    }
}

let numero =5;
console.log(`Contagem regressiva do número ${numero}`);
recursiva(numero);