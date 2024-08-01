function ePar(numero){
    
    if(numero % 2==0){
        return true;
    }else if(numero % 2==1){
        return false;
    }
}

let numero=6;
console.log(`O número ${numero} é Par: ${ePar(numero)}`);