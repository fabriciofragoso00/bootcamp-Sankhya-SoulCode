const numeroPares = array =>{
    return array.filter(numero => numero % 2 === 0);
}

let array =[2,7,3,5,10];
console.log(`Números pares do array [${array}] é: [${numeroPares(array)}]`);