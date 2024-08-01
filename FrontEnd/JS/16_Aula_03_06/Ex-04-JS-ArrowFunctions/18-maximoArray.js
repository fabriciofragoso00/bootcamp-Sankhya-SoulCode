const maximoArray = (array) =>{
    let maiorNumero =0;
    
    for(let i =0; i<=array.length; i++){
        if(array[i] > maiorNumero){
            maiorNumero = array[i]
        }
    }
    return maiorNumero;
}

let array = [3, 8, 9, 5, 7];

console.log(`O maior número desse array [${array}] é: [${maximoArray(array)}]`);