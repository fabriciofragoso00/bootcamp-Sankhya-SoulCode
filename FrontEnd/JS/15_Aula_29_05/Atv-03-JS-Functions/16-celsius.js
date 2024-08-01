function celsiusParaFahrenheit(temperatura){
    return (temperatura*1.8) + 32;
}

let temperatura =30;
console.log(`A conversão de ${temperatura} C° em Fahrenheit é: ${celsiusParaFahrenheit(temperatura)} F°`);