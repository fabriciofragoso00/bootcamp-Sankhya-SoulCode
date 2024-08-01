function verificarIdade() {
    var idade =document.getElementById('idade').value;
    var resultado =document.getElementById('resultado');

    if (idade >=0 && idade <= 12) {
        resultado.textContent = "Criança"
    }else if(idade > 12 && idade <= 18) {
        resultado.textContent = "Adolescente"
    }else if(idade > 18 && idade < 60) {
        resultado.textContent = "Adulto"
    }else if(idade >= 60 && idade <= 120) {
        resultado.textContent = "Idoso"
    }else{
        resultado.textContent = "Idade Inválida"
    }
}

function verificarMes() {
    var mes =document.getElementById('mes').value;
    var resultado2 =document.getElementById('resultado2');

    switch (mes) {
        case "1":
            resultado2.textContent = "Janeiro: Primeiro Mês do Ano."
        break;

        case "2":
            resultado2.textContent = "Fevereiro: Segundo Mês do Ano"
        break;

        case "3":
            resultado2.textContent = "Março: Terceiro Mês do Ano."
        break;

        case "4":
            resultado2.textContent = "Abril: Quarto Mês do Ano"
        break;

        case "5":
            resultado2.textContent = "Maio: Quinto Mês do Ano."
        break;

        case "6":
            resultado2.textContent = "Junho: Sexto Mês do Ano"
        break;

        case "7":
            resultado2.textContent = "Julho: Sétimo Mês do Ano."
        break;

        case "8":
            resultado2.textContent = "Agosto: Oitavo Mês do Ano"
        break;

        case "9":
            resultado2.textContent = "Setembro: Nono Mês do Ano."
        break;

        case "10":
            resultado2.textContent = "Outubro: Décimo Mês do Ano"
        break;

        case "11":
            resultado2.textContent = "Novembro: Penúltimo Mês do Ano."
        break;

        case "12":
            resultado2.textContent = "Dezembro: Último Mês do Ano"
        break;

        default:
            resultado2.textContent = "Mês Inválido"
        
    }
}