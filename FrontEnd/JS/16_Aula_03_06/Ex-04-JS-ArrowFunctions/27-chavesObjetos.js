const chavesObjetos = obj => {
    return Object.keys(obj)
};

const obj = { a: 7, b: 2, c: 4 };
console.log('Mostra somente as chaves desse objeto abaixo:');
console.log(obj);
console.log('O resultado será:');
console.log(chavesObjetos(obj));
