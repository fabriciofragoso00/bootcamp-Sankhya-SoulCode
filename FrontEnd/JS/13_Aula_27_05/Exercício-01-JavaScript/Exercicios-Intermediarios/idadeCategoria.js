let idade = 65;

if(idade >= 0 && idade < 12){
    console.log("É uma Criança!");
}else if(idade >= 12 && idade < 18){
    console.log("É um Adolescente!");
}else if(idade >= 18 && idade < 60){
    console.log("É um Adulto!");
}else if(idade >=60 && idade < 110){
    console.log("É um Idoso!");
}else{
    console.log("Idade Invalida!");
}