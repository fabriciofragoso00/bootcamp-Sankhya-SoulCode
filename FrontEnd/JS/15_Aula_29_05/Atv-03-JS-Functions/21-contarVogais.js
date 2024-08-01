function contarVogais(str){
    let countVogais=0;

    for(let i=0; i<str.length; i++){
        // console.log(str[i]);
        if(
            str[i] === 'a' || str[i] === 'e' || 
            str[i] === 'i' || str[i] === 'o' || str[i] === 'u' 
        ){
            countVogais++;
        }
    }
    return countVogais;
}

let str ='palindromo';
let char = 'a';

console.log(`Quantidade de vogais que aparece na string ${str} é: ${contarVogais(str)} vezes`);