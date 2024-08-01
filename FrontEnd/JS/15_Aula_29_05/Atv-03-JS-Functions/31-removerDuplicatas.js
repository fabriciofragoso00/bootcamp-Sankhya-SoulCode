function removerDuplicatas(array){
    let arraySemDuplicatas =[];
    
    for(let i=0; i<array.length; i++){
        for (let j=i+1; j<array.length; j++){
            if(array[i] == array[j]){
                array.indexOf(j);
                array.splice(j, 1)
                  
            }     
        }
        arraySemDuplicatas.push(array[i])    
    }
    return arraySemDuplicatas;
}
let array = [2, 5, 10, 4, 5, 6, 2, 3, 10]
console.log(`Removendo duplicatas do array [${array}], criando um novo array que será: [${removerDuplicatas(array)}]`);