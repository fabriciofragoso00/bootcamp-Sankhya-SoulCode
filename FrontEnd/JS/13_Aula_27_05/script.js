/*
// declarar uma variavel
let nome;
let idade;

var sexo;
const numero=10;

//var
var exemplo = 10;
function Teste(){
    console.log(exemplo); //10
    exemplo=20;
    console.log(exemplo); //20
}
Teste();

//var
//Hoisting(hoisted)
//Redeclaração
var y = 10;
var x = 15;
var resultado;
resultado = x-y;
var x = 99;

//let
let x=10;
x=15;

//const
// Imutabilidade
const y =10;
y=20;
*/


/*
//inicialização
let nome;
nome = "Fabricio"
console.log(nome);

nome = "Fabricio Fragoso"
console.log(nome);

const idade=31;
console.log(idade);
*/

/*
let age =25;
let name = "Joao"
let ativo = true;
let semValor = null;
let indefinido = undefined;
let lista = [1,2,3,4];
let pessoa = {nome: "Carlos", idade: 20};
*/

let k=5;
let z=k;

console.log(z);
console.log(k);

// OPERADORES DE ATRIBUIÇÃO (=)
// Atribuição com operação adicional (+=)
//Atribuição com operação de subtração (-=)
// Atribuição com operação de multiplicação(*=)
// Atribuição com operação de divisão (/=)
let valor = 5;
valor *= 3; // 15

// OPERADORES DE COMPARAÇÃO
// Igual (==)
// Igual estrito (===)
// Diferente (!=)
// Diferente estrito (!==)
let valor1 = 10;
let valor2 = "10";
console.log(valor1 != valor2);

// Maior que (>), Maior ou igual a (>=), Menor que (<), Menor ou igual a (<=)

// OPERADORES LÓGICOS
// AND lógico (&&)
// OR lógico (||)
// NOT lógico (!)

let idade = 500;

if(idade >=0 && idade <=12){
    console.log("Criança");
}else if(idade >12 && idade < 18){
    console.log("Adolescente");
}else if(idade >=18 && idade < 60){
    console.log("Adulto");
}else if (idade >= 60 && idade <= 120){
    console.log("Idoso");
}else{
    console.log("Idade inválida.")
}

// if(idade >= 18){
//     console.log("Maior de Idade.");
// }else{
//     console.log("Menor de Idade.");
// }
console.log(idade >= 18 ? "Maior de Idade": "Menor de Idade.");

// bitwise

function obterDiaSemana(dia, mes, ano) {
    let data = new Date(ano, mes - 1, dia);
    let diaSemana = data.getDay();
  
    let nomeDiaSemana;
    switch (diaSemana) {
      case 0:
        nomeDiaSemana = "Domingo";
        break;
      case 1:
        nomeDiaSemana = "Segunda-feira";
        break;
      case 2:
        nomeDiaSemana = "Terça-feira";
        break;
      case 3:
        nomeDiaSemana = "Quarta-feira";
        break;
      case 4:
        nomeDiaSemana = "Quinta-feira";
        break;
      case 5:
        nomeDiaSemana = "Sexta-feira";
        break;
      case 6:
        nomeDiaSemana = "Sábado";
        break;
      default:
        nomeDiaSemana = "Data inválida";
    }
      return nomeDiaSemana;
  }
    // Teste de uso
  let dia = 13;
  let mes = 10;
  let ano = 1988;
  
  console.log(`O dia ${dia}/${mes}/${ano} é uma ${obterDiaSemana(dia, mes, ano)}.`);