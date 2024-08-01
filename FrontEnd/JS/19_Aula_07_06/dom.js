console.log("Obrigado HTML!")

// DOM -> Document Object Model 

document //html
// console.log(document.body);
// console.log(document.body.children[0]); h1
// console.log(document.body.children[0].children[0]); u

// const meuBotao=document.getElementById("btn"); 
// console.log(meuBotao.innerText);
// meuBotao.innerText = "Clique";
// meuBotao.style.background ="tomato";
// meuBotao.style.border = "2px solid red";
// meuBotao.style.borderRadius = "5px";
// meuBotao.style.color = "white";
// document.body.style.background = "#aaa";

// document.querySelector("#btn");
// document.querySelectorAll();

const btn=document.querySelector("#btn")
console.log(btn.innerText);

const itens=document.querySelectorAll("ul li");
console.log(itens[0].innerText);

console.log(btn.id);
btn.classList.add("classe1");
console.log(btn.classList);
// btn.disabled =true;

const imagem=document.querySelector("#imagem");
imagem.width = 300;
imagem.alt = "Uma bola de futebol";
function mudarFoto() {
    imagem.src = "https://plus.unsplash.com/premium_photo-1675706185690-ec1df49e6e34?q=80&w=1228&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
  }

setTimeout(mudarFoto, 3000) //executa outra função após um tempo(segundos)

//const msg=document.querySelector("#msg");
//msg.classList.add("erro");
//msg.innerText="Preencha todos os campos"

const msg=document.querySelector("#msg");
msg.classList.add("sucesso");
msg.innerText="Avançar para a proxima etapa"

// Eventos -> Qualquer feita pelo usuário
// Eventos -> Qualquer feita pelo usuário
btn.addEventListener("click", () => {
    // bola de basquete
    imagem.src = "https://images.unsplash.com/photo-1519861531473-9200262188bf?q=80&w=1471&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
  })
  
  imagem.addEventListener("mouseenter", () => {
    imagem.src = "https://images.unsplash.com/photo-1561082826-69bd4b48eb74?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
  })
  
  const campoNome = document.querySelector("#nome")
  campoNome.addEventListener("focus", () => {
    campoNome.style.border = "2px solid blue"
  })
  
  const formulario = document.querySelector("form")
  formulario.addEventListener("submit", () => {
    msg.classList.remove("sucesso")
    msg.classList.add("erro")
    msg.innerText = "Preencha o formulário."
  })