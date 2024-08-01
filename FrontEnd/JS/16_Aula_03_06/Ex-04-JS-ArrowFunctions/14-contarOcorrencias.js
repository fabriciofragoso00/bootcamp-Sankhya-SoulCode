const contarOcorrencias = str => {
    const charCount= {};
    for (let i of str) {
      if (charCount[i] === str) {
        charCount[i]++;
      }else{
        charCount[i] = 1;
      }
    }
    return charCount;
  }

  let str = 'Gremio'
  console.log(`A contagem de cada caractere na string ${str}:`);
  console.log(contarOcorrencias(str));