// Seleciona todas as miniaturas de imagem que têm a classe thumbnail.
const thumbnails = document.querySelectorAll('.thumbnail');
// Seleciona a imagem dentro do modal, que será atualizada conforme a navegação.
const modalImage = document.getElementById('modalImage');

// Inicializa um modal Bootstrap usando o elemento com o ID imageModal.
const modal = new bootstrap.Modal(document.getElementById('imageModal'));

// Seleciona o botão para navegar para a imagem anterior.
const prevBtn = document.getElementById('prevBtn');
// Seleciona o botão para navegar para a proxima imagem.
const nextBtn = document.getElementById('nextBtn');

// índice da imagem atual:
let currentImageIndex = 0;

// Itera sobre cada miniatura
thumbnails.forEach((thumbnail, index) =>{
    // Um event listener a cada miniatura de imagem. Quando uma miniatura é clicada, a imagem correspondente é exibida no modal:
    thumbnail.addEventListener('click', () =>{
        currentImageIndex=index;
        modalImage.src=thumbnails[currentImageIndex].src;
        modal.show();
    });
});

// Um event listener para o botão de navegação anterior. Quando clicado, ele atualiza a imagem no modal para a imagem anterior:
prevBtn.addEventListener('click', () =>{
    // Atualiza currentImageIndex para o índice da imagem anterior. O cálculo garante que o índice "dê a volta" para o final da lista se estiver no início.
    currentImageIndex=(currentImageIndex - 1 + thumbnails.length) % thumbnails.length;
    modalImage.src=thumbnails[currentImageIndex].src;
    // console.log(currentImageIndex);
});
nextBtn.addEventListener('click', () =>{
    // Atualiza currentImageIndex para o índice da próxima imagem. O cálculo garante que o índice "dê a volta" para o início da lista se estiver no final.
    currentImageIndex=(currentImageIndex + 1) % thumbnails.length;
    modalImage.src=thumbnails[currentImageIndex].src;
    // console.log(currentImageIndex);
});

