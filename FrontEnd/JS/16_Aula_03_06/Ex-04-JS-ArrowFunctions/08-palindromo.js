const palindromo = str =>{
    let novaStr, strReverso;

    // regex para remover espaço da string! - / /g
    novaStr =str.toLowerCase().replace( / /g, '');
    strReverso =novaStr.split('').reverse().join('');
    
    return strReverso === novaStr  
}
// let str = 'não e palindrome'
let str = 'socorram me subi no onibus em Marrocos';
console.log(`A string '${str}' é um palindromo: ${palindromo(str)}`);