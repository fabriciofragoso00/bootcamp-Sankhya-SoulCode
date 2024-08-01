const concatenarArrays = (...arrays) => {
    return arrays.reduce((acumulador, array) => {
        return acumulador.concat(array);
    }, []);
};

let array1 = [1, 2, 3];
let array2 = [4, 5, 6];
let array3 = [7, 8, 9];

console.log(`Concatenar os Arrays [${array1}], [${array2}] e [${array3}]: [${concatenarArrays(array1, array2, array3)}]`);