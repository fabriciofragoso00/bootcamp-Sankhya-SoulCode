const fatorial = numero =>{
    if(numero <3){
        return numero;
    }
    return numero * fatorial(numero-1)
}

let numero =5;
console.log(`Fatorial do número ${numero} é: ${fatorial(numero)}`);