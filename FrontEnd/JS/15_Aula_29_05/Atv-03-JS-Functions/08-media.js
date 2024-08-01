function media(a, b, c){
    return ((a + b + c)/3).toFixed(2);
}

let nota1=5;
let nota2=8;
let nota3=7;

console.log(`A média dessas notas ${nota1}, ${nota2} e ${nota3} é: ${media(nota1, nota2, nota3)}`);