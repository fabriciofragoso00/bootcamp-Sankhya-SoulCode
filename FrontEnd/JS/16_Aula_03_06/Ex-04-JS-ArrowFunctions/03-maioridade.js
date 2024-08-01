const maioridade = idade =>{
    if(idade >= 18){
        return "Maior de Idade"
    }
    return "Menor de Idade"
}

let idade =5;
console.log(`Uma pessoa com idade ${idade} é: ${maioridade(idade)}`);