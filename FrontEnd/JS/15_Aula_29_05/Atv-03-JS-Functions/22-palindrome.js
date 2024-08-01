function inverterString(str){
    let novaStr ='';

    for(let i= str.length-1; i>=0; i--){
        novaStr +=str[i]
    }

    if(str === novaStr){
        return true;
    }
    return false;
}

let str ='roma é amor';
console.log(`A string "${str}" é um palíndrome: ${inverterString(str)}`);