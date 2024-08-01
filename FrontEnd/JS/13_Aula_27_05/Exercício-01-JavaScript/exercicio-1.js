/*
let nota1 = 5;
let nota2 = 5;
let nota3 = 5;

let resultado = (nota1 + nota2 + nota3)/3;

console.log("Media: " + resultado);
*/

function calcularNotas() {
    var nota1 =parseInt(document.getElementById('nota1').value);
    var nota2 =parseInt(document.getElementById('nota2').value);
    var nota3 =parseInt(document.getElementById('nota3').value);
    var resultado2 =document.getElementById('resultado');

    resultado2.textContent = ((nota1+nota2+nota3)/3).toFixed(2);
}