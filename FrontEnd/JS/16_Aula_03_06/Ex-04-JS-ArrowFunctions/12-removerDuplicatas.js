const removerDuplicatas = array =>{
    const arraySemDuplicatas = array.filter((valor, i) => array.indexOf(valor) === i);
    return arraySemDuplicatas;
}
let array = [3, 5, 5, 7, 9, 9, 1, 9, 2, 5, 7];
console.log(`Remover duplicatas do array [${array}], resultado será: [${removerDuplicatas(array)}]`);