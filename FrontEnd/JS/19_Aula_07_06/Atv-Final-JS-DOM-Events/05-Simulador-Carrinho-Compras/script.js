const products =[
    { id: 1, name: "PlayStation 5", price: 3500.00 },
    { id: 2, name: "Nintendo Switch", price: 3000.00 },
    { id: 3, name: "Xbox Series", price: 4000.00 }
];

const cart =[];

const productList = document.getElementById('product-list');
const cartContainer = document.getElementById('cart');
const totalContainer = document.getElementById('total');

// Renderizar a lista de produtos
const showProductList = () =>{
    products.forEach(product =>{
        const productDiv = document.createElement('div');
        productDiv.classList.add('d-flex','justify-content-between','align-items-center', 'mb-1');

        const productSpan = document.createElement('span');
        productSpan.innerHTML =`${product.name} - R$ ${product.price.toFixed(2)}`;

        const productButton =document.createElement('button');
        productButton.classList.add('btn', 'btn-success');
        productButton.innerHTML ="Adicionar ao Carrinho";
        
        productDiv.appendChild(productSpan);
        productDiv.appendChild(productButton);
        
        productList.appendChild(productDiv);

        productButton.addEventListener("click", () =>{
            addCart(product.id);
        })
    });
}

// Adicionar item ao carrinho
const addCart = productId =>{
    const product =products.find(p => p.id===productId);
    const cartItem =cart.find(item => item.product.id===productId);

    if(cartItem){
        cartItem.quantity += 1;
    }else{
        cart.push({ product, quantity: 1 });
    }
    showCart();
}

// mostrar o carrinho de compras
const showCart = () =>{
    cartContainer.innerHTML = '';

    if(cart.length === 0){
        cartContainer.innerHTML = '<p>Seu carrinho está vazio!</p>';
    } else {
        cart.forEach(item =>{
            const cartDiv =document.createElement('div');
            cartDiv.classList.add('d-flex','justify-content-between','align-items-center', 'mb-3');

            const cartSpan =document.createElement('span');
            cartSpan.innerHTML =`${item.product.name} - R$ ${item.product.price.toFixed(2)}`

            const cartInput =document.createElement('input');
            cartInput.type ='number';
            cartInput.value =`${item.quantity}`;
            cartInput.min ='1';
            
            const cartButton =document.createElement('button');
            cartButton.classList.add('btn', 'btn-danger');
            cartButton.innerHTML ="Remover"
            
            cartDiv.appendChild(cartSpan);
            cartDiv.appendChild(cartInput);
            cartDiv.appendChild(cartButton);

            cartContainer.appendChild(cartDiv);

            cartInput.addEventListener("change", () =>{
                updateQuantity(item.product.id, cartInput.value);
            })

            cartButton.addEventListener("click", () =>{
                removeCart(item.product.id);
            })
        });
    }
    updateTotal();
}

// Atualizar a quantidade de um item no carrinho
const updateQuantity = (productId, quantity) =>{
    const cartItem =cart.find(item => item.product.id===productId);

    if(cartItem){
        cartItem.quantity =parseInt(quantity);
    }

    showCart();
}

// Remover item do carrinho
const removeCart = productId =>{
    const cartIndex =cart.findIndex(item => item.product.id===productId);

    if (cartIndex !== -1) {
        cart.splice(cartIndex, 1);
    }
    showCart();
}

// Atualizar o total do carrinho
const updateTotal = () =>{
    const total =cart.reduce((sum, item) => sum + (item.product.price * item.quantity), 0);

    totalContainer.textContent =`Total: R$ ${total.toFixed(2)}`;  
}

// Inicializar a lista de produtos
showProductList();
