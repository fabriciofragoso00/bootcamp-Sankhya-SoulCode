const mesclarArrays =(arrayX, arrayY) =>{
    let arrayZ, arrayZSemDuplicatas;

    arrayZ = arrayX.concat(arrayY);
    arrayZSemDuplicatas = arrayZ.filter((valor, i) => arrayZ.indexOf(valor) === i);

    return arrayZSemDuplicatas;
}

let arrayX =[2, 3, 2, 5];
let arrayY =[3, 4, 6, 6];

console.log(`mesclar os arrays [${arrayX}] e [${arrayY}] sem duplicatas, o resultado será: [${mesclarArrays(arrayX, arrayY)}]`);