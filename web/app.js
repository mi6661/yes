document.addEventListener("DOMContentLoaded",()=>{
    const userList = document.getElementById('user-list');


    //发送http请求
    fetch('/api/users')
        .then(response=>{
            if(!response.ok){
                throw new Error('Network response was not ok' + response.statusText)
            
            }
            return response.json();
        })
        .then(data=>{
            //遍历用户数据并添加到页面中
            data.forEach(user=>{
                const listItem = document.createElement('li')
                listItem.textContent = '${user.name} - {user.password}';
                userList.appendChild(listItem);
            });
        })
        .catch(error=>{
            console.error("There was a problem with the fetch operation:",error);
        })
})