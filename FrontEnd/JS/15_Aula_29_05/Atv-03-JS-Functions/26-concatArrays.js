function concatenarArrays(arrayX,arrayY){
    
    return  arrayX.concat(arrayY);
}

let arrayX = [2, 10, 1];
let arrayY = [4, 5, 6]
console.log(`Concatenação dos arrays [${arrayX}] e [${arrayY}] fica: [${concatenarArrays(arrayX, arrayY)}]`);