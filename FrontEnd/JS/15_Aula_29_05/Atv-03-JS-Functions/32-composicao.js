function compor(...funcoes){
    return function(valor){
        return funcoes.reduce((acumulado, funcao) => {
            return funcao(acumulado)
        }, valor)
    }
}

function quadrado(numero){
    return Math.pow(numero, 2)  

}

function dividindoPorDois(numero){
    return numero / 2 
}
let numero =16;
const resultado = compor(quadrado,dividindoPorDois)(numero)

console.log(`O resultado desta operação (${numero}^2)/2 é: ${resultado}`);