class JogoDaVelha {
    constructor() {
        this.tabuleiro= [
            ['', '', ''],
            ['', '', ''],
            ['', '', '']
        ];
        this.jogadorAtual='X';
    }

    exibirTabuleiro(){
        this.tabuleiro.forEach(linha => console.log(linha));
        console.log("");
    }

    marcarPosicao(linha, coluna){
        if (this.tabuleiro[linha][coluna]!=='') {
            console.log('Posição já ocupada! Tente novamente.');
            return false;
        }
        this.tabuleiro[linha][coluna]=this.jogadorAtual;
        
        if(this.verificarVencedor()){
            this.exibirTabuleiro();
            if(this.jogadorAtual==='X'){
                console.log(`Player 1 venceu o jogo!\n`);
            }else{
                console.log(`Player 2 venceu o jogo!\n`);
            }
        }else if(this.verificarEmpate()){
            this.exibirTabuleiro();
            console.log('Jogo Empatou!\n');
        }else{
            if(this.jogadorAtual==='X'){
                this.jogadorAtual='O'; 
            }else{
                this.jogadorAtual='X'
            } 
        }
        return true;
    }

    verificarVencedor(){
        const linhas=this.tabuleiro;
        const colunas=[[], [], []];
        const diagonais=[[], []];

        for(let i=0; i<3; i++){
            for(let j=0; j<3; j++){
                colunas[j].push(this.tabuleiro[i][j]);
                /*
                ['','01','']
                ['10','','12']
                ['','21','']
                */
                if(i===j){
                    diagonais[0].push(this.tabuleiro[i][j]);
                }
                /*
                ['00','','']
                ['','11','']
                ['','','22']
                */
                if(i+j===2){
                    diagonais[1].push(this.tabuleiro[i][j]);
                } 
                /*
                ['','','02']
                ['','11','']
                ['20','','']
                */
            }
        }

        const todasLinhas=linhas.concat(colunas, diagonais);
        for (let linha of todasLinhas){
            if (linha.every(celula=>celula===this.jogadorAtual && celula!=='')){
                return true;
            }
        }
        return false;
    }

    verificarEmpate(){
        for(let i= 0; i<this.tabuleiro.length; i++){
            for(let j=0; j<this.tabuleiro[i].length; j++){
                if(this.tabuleiro[i][j]===''){
                    return false;
                }
            }
        }
        return true;
    }

    reiniciarJogo(){
        this.tabuleiro = [
            ['', '', ''],
            ['', '', ''],
            ['', '', '']
        ];
        this.jogadorAtual = 'X';
        console.log('\nReiniciando um novo jogo...\n');
    }
}

const menu = jogo => {
    let opcao;
    
    do{
        console.log("Menu:");
        console.log("1. Start Game");
        console.log("2. Restart Game");
        console.log("3. Exit Game");
        opcao=prompt("Escolha uma opção: ");
        
        switch(opcao){
            case '1':
                console.log('\nIniciando novo jogo...\n');
                
                while(true) {
                    jogo.exibirTabuleiro();
                    const linha=parseInt(prompt("Digite na linha [0 ou 1 ou 2]: "));
                    const coluna=parseInt(prompt("Digite na coluna [0 ou 1 ou 2]: "));
                    console.log("");

                    if(linha>=0 && linha<3 && coluna>=0 && coluna<3){
                        jogo.marcarPosicao(linha, coluna)
                    }else{
                        console.log("Posição inválida! Tente novamente.");
                    }

                    if(jogo.verificarVencedor() || jogo.verificarEmpate()) {
                        break;
                    }
                }
                break;
            case '2':
                jogo.reiniciarJogo();
                while(true){
                    jogo.exibirTabuleiro();
                    const linha=parseInt(prompt("Digite a linha [0 ou 1 ou 2]: "));
                    const coluna=parseInt(prompt("Digite a coluna [0 ou 1 ou 2]: "));
                    console.log("");

                    if(linha>=0 && linha<3 && coluna>=0 && coluna<3){
                        jogo.marcarPosicao(linha, coluna)
                    }else{
                        console.log("\nPosição inválida! Tente novamente.\n");
                    }

                    if(jogo.verificarVencedor() || jogo.verificarEmpate()){
                        break;
                    } 
                }
                break;
            case '3':
                console.log("Saindo do jogo...\n");
                break;
            default:
                console.log("Opção inválida! Tente novamente.");
        }
    }while(opcao!=='3');
}

const ps = require("prompt-sync");
const prompt = ps();

const jogo = new JogoDaVelha();
menu(jogo);

