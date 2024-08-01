let num1 =5;
let num2 =10;
let sum =num1 + num2;

console.log(`A soma de ${num1} + ${num2} é ${sum}`);

console.log("");
let count =0;
while(count < 5){
    console.log(`Contador atual é ${count}`);
    count++;
}

console.log("");
for(let i =0; i <10; i++){
    console.log(`Contador atual é ${i}`);
}

console.log("");
const frutas =['Maçã','Banana','Laranja', 'Uva']
for(const fruit of frutas){
    console.log(`A fruta é ${fruit}`);
}

console.log("");
const pessoas ={nome: 'Fabricio', idade: '31', cidade: 'Natal/RN'};
for(const key in pessoas){
    console.log(`${key}: ${pessoas[key]}`);
}

console.log("");
const sala = [
    {nome: 'Adriano', idade: 41, cidade: 'Mossoró-RN'},
    {nome: 'Neto', idade: 36, cidade: 'Uberlândia-MG'},
    {nome: 'Luciana', idade: 42, cidade: 'Rio de Janeiro - RJ'}
];

for(const pcd of sala){
    for(const key in pcd){
        console.log(`${key}: ${pcd[key]}`);
    }
    console.log("-------");
}

console.log("");
sala.forEach(function(alunos){
    console.log(`${alunos.nome} tem ${alunos.idade} e mora em ${alunos.cidade}`);
})

console.log("");
const nomes = ['Douglas', 'Cristian', 'Anajara'];
const idades = [30,25,35];
const combinacao = nomes.map((nome, index) =>{
    return {nome: nome, idade:idades[index]}
});
console.log(combinacao);

const combina = nomes.map((nome, index) => [nome, idades[index]]);

console.log(combina);

const combina2 = [];
nomes.forEach((nome, index)=>{
    combina2.push({nome:nome, idade:idades[index]});
});
console.log(combina2);
console.log("---------------");
const combina3 = [];
for(let i=0; i<nomes.length; i++){
    combina3.push({nome:nomes[i], idade:idades[i]});
}
console.log(combina3);