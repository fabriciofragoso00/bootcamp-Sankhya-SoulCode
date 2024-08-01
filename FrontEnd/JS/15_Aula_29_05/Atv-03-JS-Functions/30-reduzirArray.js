function reduzirArray(array, reduzir){
    return reduzir(array);
}

function reduzir(array){
    return array.reduce(
        (acumulador, valorAtual) => acumulador + valorAtual, 0);
}
let array =[0, 1, 2, 3];
console.log(`O array [${array}] reduzido: [${reduzirArray(array, reduzir)}]`);
