const data = [
    { club: 'Grêmio', title: 55, city: 'Porto Alegre' },
    { club: 'Flamengo', title: 30, city: 'Rio de Janeiro' },
    { club: 'Corinthians', title: 35, city: 'São Paulo' },
    { club: 'Cruzeiro', title: 40, city: 'Belo Horizonte' },
    { club: 'Bahia', title: 45, city: 'Salvador' }
];

let dataFilter = data;
let sortOrder = { club: 'asc', title: 'asc', city: 'asc' };

const tableBody = document.getElementById('tableBody');

const clubFilter = document.getElementById('clubFilter');
const titleFilter = document.getElementById('titleFilter');
const cityFilter = document.getElementById('cityFilter');

const clubHeader = document.getElementById('clubHeader');
const titleHeader = document.getElementById('titleHeader');
const cityHeader = document.getElementById('cityHeader');

// Função para mostrar a tabela
const showTable = data =>{
    tableBody.innerHTML ='';
    data.forEach(item =>{
        const row =document.createElement('tr');
        const tdClub =document.createElement('td');
        tdClub.innerHTML =`${item.club}`
        const tdTitle =document.createElement('td');
        tdTitle.innerHTML =`${item.title}`
        const tdCity =document.createElement('td');
        tdCity.innerHTML =`${item.city}`
        
        row.appendChild(tdClub);
        row.appendChild(tdTitle);
        row.appendChild(tdCity);
        tableBody.appendChild(row);
    });
}

// Função para ordenar os dados
const sortTable = column =>{
    const order =sortOrder[column];
    dataFilter.sort((a, b) =>{
        if(a[column] > b[column]){
            if(order==='asc'){
                return 1; // Ordem ascendente
            }else{
                return -1; // Ordem descendente
            }
        }else if(a[column] < b[column]){
            if(order==='asc'){
                return -1; // Ordem ascendente
            }else{
                return 1; // Ordem descendente
            }
        }else{
            return 0; // Se os valores são iguais
        }   
    });

    if(order==='asc'){
        sortOrder[column] ='desc';
    }else{
        sortOrder[column] ='asc';
    }
    showTable(dataFilter);
}

// Adicionar eventos de filtro e Funções para filtrar os dados
clubFilter.addEventListener('input', () =>{
    const club =clubFilter.value.toLowerCase();
    dataFilter =data.filter(item =>item.club.toLowerCase().includes(club));

    showTable(dataFilter);
});
titleFilter.addEventListener('input', () =>{
    const title =parseInt(titleFilter.value);
    if(!isNaN(title)){
    dataFilter =data.filter(item => item.title===title);
    }else{
        dataFilter =data;
    }
    showTable(dataFilter);
});

cityFilter.addEventListener('input', () =>{
    const city =cityFilter.value.toLowerCase();
    dataFilter =data.filter(item =>item.city.toLowerCase().includes(city));

    showTable(dataFilter);
});

// Adicionar eventos de ordenação
clubHeader.addEventListener('click', () =>{
    sortTable('club');
});
titleHeader.addEventListener('click', () =>{
    sortTable('title');
});
cityHeader.addEventListener('click', () =>{
    sortTable('city');
});

// Mostrar a tabela inicialmente
showTable(data);
