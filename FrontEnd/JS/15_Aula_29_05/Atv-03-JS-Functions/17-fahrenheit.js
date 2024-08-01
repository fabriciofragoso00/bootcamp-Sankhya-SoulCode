function fahrenheitParaCelsius(temperatura){
    return (temperatura-32)/ 1.8;
}

let temperatura =86;
console.log(`A conversão de ${temperatura} F° em Celsius é: ${fahrenheitParaCelsius(temperatura)} C°`);