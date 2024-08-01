class ContaBancaria{
    constructor(saldo, numeroConta){
        this.saldo=saldo;
        this.numeroConta=numeroConta;
    }

    depositar(valor){
        if(valor > 0){
            this.saldo += valor;
            console.log(`Depósito de R$${valor} foi realizado com sucesso na conta ${this.numeroConta}. Novo saldo: R$${this.saldo}`);  
        }else{
            console.log('Valor de saque inválido. Tente novamente!');
        }
    }

    sacar(valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            console.log(`Saque de R$${valor} foi realizado com sucesso. Novo saldo da conta ${this.numeroConta}: R$${this.saldo}`);
        }else if(valor > this.saldo){
            console.log('Saldo insuficiente para saque. verifique seu saldo!');
        }else {
            console.log('Valor de saque inválido. Tente novamente!');
        }
    }

    verificarSaldo() {
        console.log(`A conta ${this.numeroConta} possui um saldo atual de: R$${this.saldo}`);
        return this.saldo;
    }
}

const menuContaBancaria = conta =>{
    let opcao;

    console.log("-----------SISTEMA BANCARIO-----------\n");
    
    console.log(
      "1. Verificar saldo\n" +
      "2. Depositar\n" +
      "3. Sacar\n" +
      "4. Sair\n"
    );
    
    console.log("-----------SISTEMA BANCARIO-----------\n");
    
    while(opcao !=4){
      opcao = parseInt(prompt("Escolha uma opção: "));
      
      switch (opcao) {
        case 1:
          conta.verificarSaldo();
          break;
        case 2:
          const valorDeposito = parseFloat(prompt("Digite o valor para depositar:"));
          conta.depositar(valorDeposito);
          break;
        case 3:
          const valorSaque = parseFloat(prompt("Digite o valor para sacar:"));
          conta.sacar(valorSaque);
          break;
        case 4:
          console.log("Saindo do sistema.");
          break;
        default:
          console.log("Opção inválida. Tente novamente.");
      }
    }    
}

const ps = require("prompt-sync");
const prompt = ps();

const minhaConta = new ContaBancaria(0, '12345-6');
menuContaBancaria(minhaConta);
