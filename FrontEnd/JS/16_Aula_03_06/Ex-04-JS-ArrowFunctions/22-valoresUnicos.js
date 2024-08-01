const valoresUnicos = arr => [...new Set(arr)];

let array = [1, 2, 2, 3, 4, 4, 5];
console.log(`Mostre somente os valores únicos desse array [${array}]: [${valoresUnicos(array)}]`);