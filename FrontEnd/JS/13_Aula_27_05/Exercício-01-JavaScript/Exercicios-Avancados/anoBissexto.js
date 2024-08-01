let anoBissexto = 2400;

if(anoBissexto%4 == 0 ){
    if(anoBissexto%100 == 0){
        if(anoBissexto%400 == 0){
            console.log("O Ano é bissexto");
        }else{
            console.log("O Ano não é bissexto");
        }   
    }else{
        console.log("O Ano é bissexto");
    }
}else{
    console.log("O Ano não é bissexto");
}