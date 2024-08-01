const btnMostrar = document.querySelector('.btn-mostrar-projetos');
const projetosInativos = document.querySelectorAll('.projeto:not(.ativo)')

btnMostrar.addEventListener('click', ()=>{
    mostrarMais();
    esconderBtn();
})
    function mostrarMais(){
        projetosInativos.forEach(projetoInativo =>{
            projetoInativo.classList.add('ativo')
        })
    }
    
    function esconderBtn(){
        btnMostrar.classList.add('remover')
    
    
    }