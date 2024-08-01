function ePrimo(x){
    for(let i =2; i < x; i++){
        if(x % i == 0){
            return false;
        }
    }
    return true;
}

let numero = 7;

console.log("TRUE para primo e FALSE para caso contrário");
console.log(`O número ${numero} é: ${ePrimo(numero)}`);