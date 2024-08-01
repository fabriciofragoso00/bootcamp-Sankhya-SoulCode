function ordenarArray(numeros){
    let aux;
    let menor;

    for(let i=0; i<numeros.length-1; i++){
        menor =i;
        for (let j=i+1; j<numeros.length; j++){
            if(numeros[j] < numeros[menor]){
                menor =j;
            }    
        }
        if(i != menor){
            // [numeros[i], numeros[menor]] = [numeros[menor], numeros[i]];
            aux = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = aux; 
        }  
    }
    return numeros;
}
let array = [2, 10, 1, 4, 6, 5]
console.log(`O array [${array}] em ordem crescente: ${ordenarArray(array)}`);