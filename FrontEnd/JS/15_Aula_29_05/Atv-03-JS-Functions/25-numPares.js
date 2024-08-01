function filtrarPares(array, aPares){
 for(let i=0; i<array.length; i++){
    if (array[i] % 2==0){
        aPares.push(array[i]);
    }
    
 }
 return aPares;
}
let array = [2, 10, 1, 4, 6, 5];
let arrayPares = [];
console.log(`Quais são os números pares desse array [${array}]: [${filtrarPares(array, arrayPares)}]`); 