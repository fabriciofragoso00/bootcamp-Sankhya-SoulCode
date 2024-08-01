let numero1 = 5;
let numero2 = 5;
let operacao = 5;
let adicao, subtracao, multiplicacao, divisao;

adicao = numero1 + numero2;
subtracao = numero1 - numero2;
multiplicacao = numero1 * numero2;
divisao = numero1/numero2;

switch (operacao) {
    case 1:
      console.log(` Operação Adição Selecionada: ${numero1} + ${numero2} = ${adicao}`);
      break;
    case 2:
      console.log(` Operação Subtração Selecionada: ${numero1} - ${numero2} = ${subtracao}`);
      break;
    case 3:
      console.log(` Operação Multiplicação Selecionada: ${numero1} * ${numero2} = ${multiplicacao}`);
      break;
    case 4:
      console.log(` Operação Divisão Selecionada: ${numero1} / ${numero2} = ${divisao}`);
        break;
    default:
        console.log("Operação Invalida");
}