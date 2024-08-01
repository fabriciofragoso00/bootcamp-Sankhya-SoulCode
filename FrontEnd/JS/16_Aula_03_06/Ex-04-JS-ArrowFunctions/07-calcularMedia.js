const calcularMedia = array =>{
    const somaMedia = array.reduce((acumulador, n) => acumulador + n, 0);
    return somaMedia/array.length; 
}
let array = [8, 5, 9];
console.log(`Dado o array de notas [${array}] a média será: ${calcularMedia(array).toFixed(2)}`);