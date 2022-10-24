let table_content = document.getElementById("table_content");

async function showUsers(pageNumber){
    table_content.innerHTML = 'Loading...';

    const request = await fetch(`api/users?pageNumber=${pageNumber}`, {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    const jsonResponse = await request.json();
    table_content.innerHTML = '';

    let users = jsonResponse.users;

    users.forEach((user) =>{
        let userTableRow = `
            <tr>
                <td>${user.id}</td>
                <td>${user.first_name}</td>
                <td>${user.last_name}</td>
                <td>${user.nationality}</td>
                <td>${user.age}</td>
                <td>${user.email}</td>
            </tr>
        `;

        table_content.innerHTML += userTableRow;
    });

    let availablePages = jsonResponse.available_pages;

    let pagination_buttons = document.getElementById("pagination_buttons");
    pagination_buttons.innerHTML = '';
    availablePages.forEach((number) => {
        if(number === pageNumber) {
            pagination_buttons.innerHTML += `<li class="page-item active" onclick="showUsers(${number})"><span class="page-link" style="background-color: rgb(0, 200, 0); border: 1px solid rgb(100, 100, 100)" href="#">${number}</span></li>`;
        } else {
            pagination_buttons.innerHTML += `<li class="page-item" onclick="showUsers(${number})"><a class="page-link" style="border: 1px solid rgb(100, 100, 100); color: rgb(100, 100, 100)" href="#">${number}</a></li>`;
        }
    })
}

showUsers(1);
