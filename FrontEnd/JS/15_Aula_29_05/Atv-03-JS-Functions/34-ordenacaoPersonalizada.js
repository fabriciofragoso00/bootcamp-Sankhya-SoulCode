function ordenarPersonalizado(array,ordem){
    return ordem(array);
}

function ordemCrescente(array){
    let aux;
    let menor;

    for(let i=0; i<array.length-1; i++){
        menor =i;
        for (let j=i+1; j<array.length; j++){
            if(array[j] < array[menor]){
                menor =j;
            }    
        }
        if(i != menor){
            // [array[i], array[menor]] = [array[menor], array[i]];
            aux = array[i];
            array[i] = array[menor];
            array[menor] = aux; 
        }  
    }
    return array;
}

function ordemDecrescente(array){
    let aux;
    let maior;

    for(let i=0; i<array.length-1; i++){
        maior =i;
        for (let j=i+1; j<array.length; j++){
            if(array[j] > array[maior]){
                maior =j;
            }    
        }
        if(i != maior){
            // [array[i], array[maior]] = [array[maior], array[i]];
            aux = array[i];
            array[i] = array[maior];
            array[maior] = aux; 
        }  
    }
    return array;
}
let array1 = [2, 10, 1, 4, 6, 5]
console.log(`O array [${array1}] em ordem crescente: ${ordenarPersonalizado(array1,ordemCrescente)}`);
let array2 = [2, 10, 1, 4, 6, 5]
console.log(`O array [${array2}] em ordem decrescente: ${ordenarPersonalizado(array2, ordemDecrescente)}`);