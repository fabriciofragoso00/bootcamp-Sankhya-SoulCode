let primeiroLado = 1;
let segundoLado = 1;
let terceiroLado = 4;

if(primeiroLado + segundoLado >= terceiroLado){
    console.log("Os três segmentos formam um triângulo");

    if(primeiroLado == segundoLado && primeiroLado == terceiroLado){
        console.log("Esse Triangulo é Equilatero");
    }else if(primeiroLado == segundoLado && primeiroLado != terceiroLado){
        console.log("Esse Triangulo é Isósceles");
    }else if(primeiroLado !== segundoLado && primeiroLado != terceiroLado){
        console.log("Esse Triangulo é Escaleno");
    }

}else{
    console.log("Os três segmentos não formam um triângulo");
}