function fatorial(x) {
    let resultado = x;

    for(let i = x-1; i >=1; i--){
        resultado*=i;
    }
    return resultado;
}
let numero =5;
console.log(`Fatorial do número ${numero} é: ${fatorial(numero)}`);