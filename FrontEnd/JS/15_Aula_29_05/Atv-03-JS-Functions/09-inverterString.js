function inverterString(str){
    let novaStr ='';

    for(let i= str.length-1; i>=0; i--){
        novaStr +=str[i]
    }
    return novaStr;
}

let str ='soulCode';
console.log(`A string ${str} invertida: ${inverterString(str)}`);