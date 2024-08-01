const somaValoresObj = array => {
    return array.reduce((acumulador, obj) => acumulador + obj.valor, 0);
}

let arrayObj = [{ valor: 10 }, { valor: 33 }, { valor: 80 }];
console.log(`A soma dos objetos desse array [${arrayObj[0].valor} ${arrayObj[1].valor} ${arrayObj[2].valor}] é: ${somaValoresObj(arrayObj)}`);
