let nota = 12;

if(nota >= 9 && nota <= 10){
    console.log("Nota A!");
}else if(nota >= 7.5 && nota < 9){
    console.log("Nota B!");
}else if(nota >= 5 && nota < 7.5){
    console.log("Nota C!");
}else if(nota >=3 && nota < 5){
    console.log("Nota D!");
}else if(nota >= 0 && nota < 3){
    console.log("Nota F!");
}else{
    console.log("Nota Invalida!, Digite um numero de 0 a 10");
}