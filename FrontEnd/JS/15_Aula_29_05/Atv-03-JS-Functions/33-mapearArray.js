function mapearArray(array, operacao) {
    return operacao(array);
}

function raizQuadrada(array) {
    return array.map(Math.sqrt);
}
let array =[16, 25, 49, 81]
console.log(`A raiz quadrada desse arrays [${array}] é: [${mapearArray(array, raizQuadrada)}]`);