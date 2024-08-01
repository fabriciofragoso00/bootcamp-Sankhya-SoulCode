function memoFatorial(numero){
    if(numero<=1){
        return 1;
    }
    return numero * memoFatorial(numero-1);
}

let numero =5;
console.log(`Fatorial do número ${numero} é: ${memoFatorial(numero)}`);