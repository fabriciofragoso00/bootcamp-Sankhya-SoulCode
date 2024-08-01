let cliente = true;

let renda = 12000;
let idade = 6;
let historico =true;
let prazo;

console.log("");
console.log("Sistema de Emprestimo! Aprovando Cliente...");
if(cliente == true){
    console.log("CPF Aprovado!");
    if(renda >= 1415){
        console.log("Renda Aprovada!");
        if(idade >=18 && idade <= 75){
            console.log("Idade Aprovada!");
            if(idade > 35){
                idade = idade - 35;
                prazo = 36 - idade;
            }
            if(historico == true){
                console.log("histórico Aprovado!");
                console.log("Cliente elegível para emprestimo! Valor da prestação máxima e o prazo para o empréstimo será: " + "R$" + renda*0.30 + " em " + prazo + " anos");
            }else{
                console.log("Histórico Reprovado! Cliente inelegível para empréstimo");
            }
        }else{
            console.log("Idade Reprovada! Cliente inelegível para empréstimo");
        }
    }else{
        console.log("Renda insuficiente! Cliente inelegível para empréstimo")
    }
}else{
    console.log("CPF Reprovado! Cliente inelegível para empréstimo");
}