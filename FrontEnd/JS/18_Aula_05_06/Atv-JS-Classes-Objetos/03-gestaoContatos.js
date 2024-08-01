class Contato{
    constructor(nome, telefone, email) {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
    }
}

class Agenda{
    constructor() {
        this.listaContatos = [];
    }

    adicionar(contato){
        return this.listaContatos.push(contato);
    }

    remover(nome){
        let naLista=this.listaContatos.find(contato=>contato.nome===nome);
        const indice=this.listaContatos.indexOf(naLista);
        
        if(indice!==-1) {
            this.listaContatos.splice(indice, 1);
            console.log(`Contato ${nome} foi removido.`);
        } else {
            console.log(`Contato ${nome} não foi encontrado.`);
        }
    }

    pesquisar(nome){
        let naLista=this.listaContatos.find(contato=>contato.nome===nome);
        if(naLista){
            console.log(
                "Contato foi encontrado!\n\n" + 
                "Nome: " + naLista.nome + "\n" +
                "Telefone: " + naLista.telefone + "\n" +
                "Email: " + naLista.email + "\n");
        }else{
            console.log(`Contato ${nome} não foi encontrado.`);
        }
    }
}

const agenda = new Agenda();

const contato1 = new Contato('Fabricio', '1234-5678', 'fabricio@example.com');
const contato2 = new Contato('Felipe', '9876-5432', 'felipe@example.com');

console.log("-----------CONTATO_1-----------");
console.log(contato1);
console.log("-----------CONTATO_2-----------");
console.log(contato2);
console.log("-------------------------------");

console.log("\nAdicionando os contatos a agenda!\n");
agenda.adicionar(contato1);
console.log(`Contato ${contato1.nome} foi adicionado(a) na agenda.`);
agenda.adicionar(contato2);
console.log(`Contato ${contato2.nome} foi adicionado(a) na agenda.\n`);

console.log("------------AGENDA------------");
console.log(agenda);
console.log("------------------------------");

console.log("\nRemovendo os contatos da agenda!\n");
agenda.remover('Felipe');
agenda.remover("Ari");

console.log("\n------------AGENDA------------");
console.log(agenda);
console.log("------------------------------\n");

console.log("Pesquisar Contatos:");
agenda.pesquisar('Fabricio');
agenda.pesquisar('Nizia');