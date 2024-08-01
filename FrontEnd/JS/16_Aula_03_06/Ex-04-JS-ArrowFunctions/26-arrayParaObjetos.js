const arrayParaObjeto = (array) =>{
    return Object.fromEntries(array);
} 
const arrayChaveValor = [['a', 1], ['b', 2], ['c', 3]];

console.log(`Transforme esse array abaixo em objetos:`);
console.log(arrayChaveValor);
console.log("O resultado será:");
console.log(arrayParaObjeto(arrayChaveValor));