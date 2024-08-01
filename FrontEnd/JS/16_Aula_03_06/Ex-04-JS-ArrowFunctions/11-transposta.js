const calcularTransposta = matriz => {
    const matrizTransposta = [];

    if (!matriz || matriz.length === 0 || matriz[0].length === 0) {
        return false;
    }
   
    for (let i = 0; i < matriz[0].length; i++) {
        matrizTransposta[i] = [];
        for (let j = 0; j < matriz.length; j++) {
            matrizTransposta[i][j] = matriz[j][i];
        }
    }
    return matrizTransposta;
}

let matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

// let matriz = [];

let matrizTransposta = calcularTransposta(matriz);

console.log('Calcule a matriz transposta da matriz abaixo:');
for (let i = 0; i < matriz.length; i++) {
    console.log(matriz[i]); 
}

console.log('');
console.log('Resposta:');

if(matrizTransposta === false){
    console.log('Não pode ser transposta! É uma matriz que não possui elementos, ou seja, uma matriz vazia.');
}else{
    for (let j = 0; j < matrizTransposta.length; j++) {
        console.log(matrizTransposta[j]); 
    }  
}

