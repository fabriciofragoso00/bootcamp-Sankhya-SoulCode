const numeroImpares = array =>{
    return array.filter(numero => numero % 2 === 1);
}

let array =[2,7,3,5,10];
console.log(`Números impares do array [${array}] é: [${numeroImpares(array)}]`);