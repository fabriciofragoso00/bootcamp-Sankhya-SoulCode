const produtoArray = array => {
    let produto = array.reduce((acumulador, valor) => acumulador * valor, 0);
    return produto;
}

let array =[1, 2, 3, 4, 5];
console.log(`O resultado do produto desse array [${array}] é: ${produtoArray(array)}`);