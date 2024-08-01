const f = numero => numero + 5;
const g = mumero => mumero * 3;

const compor = (f, g) => {
    return (numero) => {
      return f(g(numero));
    }
}

const h = compor(f, g);
let numero = 3
console.log(`Resultado da função que representa a composição f(g(x)): ${h(numero)}`); 