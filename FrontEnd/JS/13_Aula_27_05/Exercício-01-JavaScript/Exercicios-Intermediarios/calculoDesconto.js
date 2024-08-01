let valorTotal = 3000;
let desconto = 75;
let valorFinal;

if(desconto == 25){
    valorFinal = valorTotal - (valorTotal * 0.25);
    console.log(`Valor total é: R$ ${valorTotal.toFixed(2)}, mas com desconto 25% fica por: R$ ${valorFinal.toFixed(2)}`);
}else if(desconto == 50){
    valorFinal = valorTotal - (valorTotal * 0.50);
    console.log(`Valor total é: R$ ${valorTotal.toFixed(2)}, mas com desconto 50% fica por: R$ ${valorFinal.toFixed(2)}`);
}else if(desconto == 75){
    valorFinal = valorTotal - (valorTotal * 0.75);
    console.log(`Valor total é: R$ ${valorTotal.toFixed(2)}, mas com desconto 75% fica por: R$ ${valorFinal.toFixed(2)}`);
}else{
    console.log("Desconto Invalido");
}