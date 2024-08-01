const combinarObjetos = (obj1, obj2) =>{
    let obj3 ={};

    obj3 = Object.assign({}, obj1, obj2);

    return obj3
} 

let obj1 = { a: 1, b: 2 };
let obj2 = { b: 3, c: 4 };

console.log("Combinando os objetos abaixo:");
console.log(obj1);
console.log(obj2);
console.log("O resultado será:"); 
console.log(combinarObjetos(obj1, obj2));
