function intersecaoArrays (arrayX, arrayY) { 
    return arrayX.filter(i => arrayY.includes(i)); 
  }

let arrayX = [2, 10, 1, 3];
let arrayY = [4, 5, 6, 2, 10];
console.log(`A interseção desses dois arrays [${arrayX}], [${arrayY}] é: [${intersecaoArrays(arrayX, arrayY)}]`);
