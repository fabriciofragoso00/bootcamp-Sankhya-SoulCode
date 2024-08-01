function calcular(x, y, operacao) {
    return operacao(x, y);
}

function somar(x, y) {
    return x+y;
}

function subtrair(x, y) {
    return x-y;
}

function multiplicar(x, y) {
    return x*y;
}

function dividir(x, y) {
    return x/y;
}

let resultado = console.log(`operação somar: ${calcular(15, 3, somar)}`);
let resultado2 = console.log(`operação subtrair: ${calcular(15, 3, subtrair)}`);
let resultado3 = console.log(`operação multiplicar: ${calcular(15, 3, multiplicar)}`);
let resultado4 = console.log(`operacao dividir: ${calcular(15, 3, dividir)}`);