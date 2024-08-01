function maiorNumero(numeros){
    let max=0;

    for(let i =0; i<numeros.length; i++){
        if(numeros[i] > max){
            max=numeros[i];
        }
    }
    return max;
}
let array = [2, 10, 1, 4, 6, 5]
console.log(`O maior número do array [${array}] é: ${maiorNumero(array)}`);