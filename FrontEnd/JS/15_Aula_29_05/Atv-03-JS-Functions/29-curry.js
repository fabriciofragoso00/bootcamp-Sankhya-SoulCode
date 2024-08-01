function currySoma(numero){
    let soma =0; 
    soma += numero;
    return function(numero){
        soma += numero;
        return function(numero){
            return soma += numero;
        }        
    }    
}

console.log(`Operação somar usando Curry: ${currySoma(2)(2)(2)}`);

