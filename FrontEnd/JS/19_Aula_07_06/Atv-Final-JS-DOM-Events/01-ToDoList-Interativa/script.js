const input=document.querySelector("#box-input");
const btnAdd=document.querySelector("#btnAdd");

const listContainer=document.querySelector("#container-list");

btnAdd.addEventListener("click", ()=>{
    if(input.value===''){
        alert("Você deve escrever alguma tarefa")
    }else{
        addTask(input.value);
    }

    input.value="";
})

const addTask=inputText=>{
    const li=document.createElement("li");   
    li.innerHTML=inputText;
    
    const div=document.createElement("div");
    div.classList.add("buttons");
    li.appendChild(div)

    const editBtn=document.createElement("button");
    editBtn.innerHTML='Editar';
    editBtn.classList.add("btn","btn-outline-info");
    div.appendChild(editBtn);

    editBtn.addEventListener('click', ()=>{
        const inputOriginal = li.firstChild.innerHTML;
        const newInput = prompt("Edite sua tarefa:", inputOriginal);

        if (newInput!==null && newInput.trim()!=='') {
            li.firstChild.textContent = newInput.trim();
        }
    });

    const delBtn = document.createElement('button');
    delBtn.innerHTML='Delete';
    delBtn.classList.add("btn","btn-outline-danger")
    div.appendChild(delBtn);

    delBtn.addEventListener('click', ()=>li.remove());

    listContainer.appendChild(li);
}

listContainer.addEventListener('click', (completeTask)=>{
    if(completeTask.target.tagName === "LI"){
        completeTask.target.classList.toggle("checked");
    }
})



