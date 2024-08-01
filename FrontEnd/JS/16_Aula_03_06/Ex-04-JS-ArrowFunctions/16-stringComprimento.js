const stringComprimento = (array, numero) =>{
    return array.filter(str => str.length > numero);
}

let array = ["banana", "maçã", "abacaxi", "laranja", "uva"];
let numero = 5;
console.log(`Dado o array [${array}] mostre apenas os strings com comprimento maior que ${numero}: [${stringComprimento(array, numero)}]`);