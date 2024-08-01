const addFieldBtn = document.querySelector('#addFieldBtn');
// Botão que, ao ser clicado, adiciona novos campos ao formulário.
const dynamicForm = document.querySelector('#dynamicForm');
// Contêiner onde os novos campos serão adicionados.
addFieldBtn.addEventListener('click', () => {   
    // Código para adicionar novos campos será inserido aqui

    // Vários contêineres div para organizar os diferentes tipos de campos:
    const fieldContainer = document.createElement('div');
    
    // Contém o campo de texto e o botão para removê-lo.
    const textContainer = document.createElement('div');
    textContainer.classList.add("d-flex", "justify-content-between", "gap-3", "mb-3");

    // Contém o campo de e-mail e o botão para removê-lo.
    const emailContainer = document.createElement('div');
    emailContainer.classList.add("d-flex", "justify-content-between", "gap-3", "mb-3");

    // Contém os checkboxes e o botão para removê-los.
    const checkboxContainer = document.createElement('div');
    checkboxContainer.classList.add("d-flex", "justify-content-between", "align-items-center", "mb-5");

    // Contém o botão de submissão e o botão para removê-lo.
    const buttonContainer = document.createElement('div');
    buttonContainer.classList.add("d-flex", "justify-content-between", "mb-4")
    
    // Campos de entrada e botões:

    // Campo de entrada para texto
    const textField = document.createElement('input');
    textField.type = 'text';
    textField.placeholder = 'Nome Completo';
    textField.classList.add("form-control")
    
    // Campo de entrada para email
    const emailField = document.createElement('input');
    emailField.type = 'email';
    emailField.placeholder = 'nome@exemplo.com';
    emailField.classList.add("form-control")

    // Campo de entrada para os checkboxes
    const checkboxContent = document.createElement('div');
    checkboxContent.classList.add("d-flex", "gap-2");
    
    // Três checkboxes e Labels para os checkboxes
    const checkboxField1 = document.createElement('input');
    checkboxField1.type = 'checkbox';
    checkboxField1.id = 'checkbox1'; 
    checkboxField1.classList.add("form-check-input");
    const checkboxLabel1 = document.createElement('label');
    checkboxLabel1.htmlFor = 'checkbox1'; // Associando label ao checkbox
    checkboxLabel1.textContent = 'Opção 1';

    const checkboxField2 = document.createElement('input');
    checkboxField2.type = 'checkbox';
    checkboxField2.id = 'checkbox2';
    checkboxField2.classList.add("form-check-input");
    const checkboxLabel2 = document.createElement('label');
    checkboxLabel2.htmlFor = 'checkbox2'; // Associando label ao checkbox
    checkboxLabel2.textContent = 'Opção 2';

    const checkboxField3 = document.createElement('input');
    checkboxField3.type = 'checkbox';
    checkboxField3.id = 'checkbox3'
    checkboxField3.classList.add("form-check-input");
    const checkboxLabel3 = document.createElement('label');
    checkboxLabel3.htmlFor = 'checkbox3'; // Associando label ao checkbox
    checkboxLabel3.textContent = 'Opção 3';

    // Botão de submissão.
    const buttonSubmitField = document.createElement('button');
    buttonSubmitField.type = 'submit';
    buttonSubmitField.textContent = 'Submit'
    buttonSubmitField.classList.add("btn", "btn-success")

    // Botões para remover os respectivos contêineres.
    const textBtn = document.createElement('button');
    textBtn.type = 'button'; // Tipo botão para não enviar o formulário
    textBtn.textContent = 'Remover';
    textBtn.classList.add("btn", "btn-danger");

    const emailBtn = document.createElement('button');
    emailBtn.type = 'button';
    emailBtn.textContent = 'Remover';
    emailBtn.classList.add("btn", "btn-danger")

    const checkboxBtn = document.createElement('button');
    checkboxBtn.type = 'button'; // Tipo botão para não enviar o formulário
    checkboxBtn.textContent = 'Remover';
    checkboxBtn.classList.add("btn", "btn-danger")

    const buttonBtn = document.createElement('button');
    buttonBtn.type = 'button'; // Tipo botão para não enviar o formulário
    buttonBtn.textContent = 'Remover';
    buttonBtn.classList.add("btn", "btn-danger")

    // Event listeners aos botões de remoção para que eles removam seus respectivos contêineres quando clicados:
    textBtn.addEventListener('click', () => {
        textContainer.remove();
    });

    emailBtn.addEventListener('click', () => {
        emailContainer.remove();
    });

    checkboxBtn.addEventListener('click', () => {
        checkboxContainer.remove();
    });

    buttonBtn.addEventListener('click', () => {
        buttonContainer.remove();
    });

    // Os campos e botões nos contêineres apropriados:
    textContainer.appendChild(textField);
    textContainer.appendChild(textBtn);

    emailContainer.appendChild(emailField);
    emailContainer.appendChild(emailBtn);

    checkboxContent.appendChild(checkboxField1);
    checkboxContent.appendChild(checkboxLabel1);
    checkboxContent.appendChild(checkboxField2);
    checkboxContent.appendChild(checkboxLabel2);
    checkboxContent.appendChild(checkboxField3);
    checkboxContent.appendChild(checkboxLabel3);
    checkboxContainer.appendChild(checkboxContent);
    checkboxContainer.appendChild(checkboxBtn);

    buttonContainer.appendChild(buttonSubmitField);
    buttonContainer.appendChild(buttonBtn);
    
    // Adicionamos todos os contêineres ao fieldContainer, que é então adicionado ao dynamicForm:
    fieldContainer.appendChild(textContainer);
    fieldContainer.appendChild(emailContainer);
    fieldContainer.appendChild(checkboxContainer);
    fieldContainer.appendChild(buttonContainer);

    dynamicForm.appendChild(fieldContainer);
    
    });

