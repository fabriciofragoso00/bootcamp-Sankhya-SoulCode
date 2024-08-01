const valoresObjetos = obj => {
    return Object.values(obj)
};

const obj = { a: 7, b: 2, c: 4 };
console.log('Mostra somente osvalores desse objeto abaixo:');
console.log(obj);
console.log('O resultado será:');
console.log(valoresObjetos(obj));