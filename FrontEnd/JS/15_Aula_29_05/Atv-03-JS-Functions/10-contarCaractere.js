function contarCaracteres(str, char){
    let count=0;

    for(let i=0; i<str.length; i++){
        // console.log(str[i]);
        if(str[i] === char){
            count++;
        }
    }
    return count;
}

let str ='arara';
let char = 'a';

console.log(`Número vezes que caractere "${char}" aparece na string ${str}: ${contarCaracteres(str, char)} vezes`);

