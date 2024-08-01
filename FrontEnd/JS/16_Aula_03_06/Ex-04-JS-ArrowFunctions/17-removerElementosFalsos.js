const removerElementosFalsos = array => array.filter(Boolean);

let array = [0, 1, false, 2, '', 3, null, 'a', undefined, NaN, 'b'];
console.log(`Dado o array [${array}] remova os elementos falsos: [${removerElementosFalsos(array)}]`);
