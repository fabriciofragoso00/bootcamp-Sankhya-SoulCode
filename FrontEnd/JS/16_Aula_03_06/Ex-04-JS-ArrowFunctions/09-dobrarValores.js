const dobraValores = array =>{
    return array.map(n => n * 2)
}

let array =[3, 4, 5, 6]
console.log(`O array [${array}] com valores dobrados: [${dobraValores(array)}]`);