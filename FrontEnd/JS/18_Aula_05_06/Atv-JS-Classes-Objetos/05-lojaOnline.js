class Produto{
    constructor(nome, preco, estoque){
        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;
    }
}

class CarrinhoDeCompras{
    constructor(){
        this.listaProdutos=[];
    }

    adicionar(produto, quantidade){
        if(quantidade<=0){
            console.log('Quantidade inválida.\n');
            return;
        }

        if(produto.estoque<quantidade) {
            console.log(`Quantidade em estoque insuficiente para o produto: ${produto.nome}\n`);
            return;
        }

        const noCarrinho = this.listaProdutos.find(p=> p.produto.nome===produto.nome);

        if(noCarrinho==true){
            noCarrinho.quantidade+= quantidade;
        }else{
            this.listaProdutos.push({ produto, quantidade });
        }

        produto.estoque-= quantidade;
        console.log(`Produto ${produto.nome} adicionado ao carrinho. Quantidade: ${quantidade}\n`);
    }

    calcularCompra() {
        return this.listaProdutos.reduce((total, p) => total + p.produto.preco * p.quantidade, 0);
      }
    
    finalizar() {
        const valorTotal = this.calcularCompra();
        
        if(valorTotal>0) {
          console.log(`Compra finalizada. Total: R$${valorTotal.toFixed(2)}\n`);
          this.produtos=[];
        }else{
          console.log('Carrinho está vazio. Adicione produtos antes de finalizar a compra.\n');
        }
    }   
}

const menuLojaOnline = carrinhoCompras =>{
    let opcao;
    console.log("-----------LOJA ONLINE-----------\n");
    
    console.log(
        "Produto: ps5, Quantidade: 10\n" +
        "Produto: xbox, Quantidade: 5\n" +
        "Produto: nintendo, Quantidade: 5\n" 
    );
    console.log(
      "1. Adicionar Produto\n" +
      "2. Calcular o valor da compra\n" +
      "3. Finalizar Compra\n" +
      "4. Mostra lista de produtos\n" +
      "5. Sair\n"
    );
    
    console.log("-----------LOJA ONLINE-----------\n");

    while(opcao !=5){
        opcao = parseInt(prompt("Escolha uma opção: "));
        
        switch (opcao) {
          case 1:
            const produto=prompt("Digite o nome do produto que deseja adicionar ao carrinho: ");

            if(produto === 'ps5'){
                const quantidade = parseInt(prompt("Digite a quantidade: "));
                const ps5 = new Produto('Ps5', 3500, 10);
                carrinhoCompras.adicionar(ps5, quantidade)
            }else if(produto === 'xbox'){
                const quantidade = parseInt(prompt("Digite a quantidade: "));
                const xbox = new Produto('Xbox', 4000, 5);
                carrinhoCompras.adicionar(xbox, quantidade)
            }else if(produto === 'nintendo'){
                const quantidade = parseInt(prompt("Digite a quantidade: "));
                const nintendo = new Produto('Nintendo', 3000, 3);
                carrinhoCompras.adicionar(nintendo, quantidade)
            }else{
                console.log("Produto Inválido!");
            }
            break;
          case 2:
            console.log(`Total da compra: R$${carrinhoCompras.calcularCompra().toFixed(2)}\n`);
            break;
          case 3:
            carrinhoCompras.finalizar();
            break;
          case 4:
            console.log(
                "\n" +
                "Produto: ps5, Quantidade: 10\n" +
                "Produto: xbox, Quantidade: 5\n" +
                "Produto: nintendo, Quantidade: 5\n" 
            );
            break;
          case 5:
            console.log("Volte Sempre!.\n");
            break;
          default:
            console.log("Opção inválida. Tente novamente.");
        }
    }    
}

const ps = require("prompt-sync");
const prompt = ps();

const carrinho = new CarrinhoDeCompras();

menuLojaOnline(carrinho);
