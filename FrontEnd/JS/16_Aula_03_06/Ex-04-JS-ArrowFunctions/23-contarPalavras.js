const contarPalavras = (str) => {
    return str.split(" ").length;
}

let frase = "Gremio, maior time do RS!";
console.log(`Quantas palavras existem nessa frase "${frase}": ${contarPalavras(frase)} palavras`);
