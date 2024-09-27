document.addEventListener("DOMContentLoaded",()=>{
    const userList = document.getElementById('user-list');


    //发送http请求
    fetch('/users')
        .then(response=>{
            if(!response.ok){
                alert("失败");
                throw new Error('Network response was not ok' + response.statusText);
            }
            alert("step one is successful");
            return response.json();
        })
        .then(data=>{
            //遍历用户数据并添加到页面中
            data.forEach(users=>{
                const listItem = document.createElement('li');
                listItem.textContent = `${users.name} - ${users.password}`;
                userList.appendChild(listItem);
            });
        })
        .catch(error=>{
            console.error("There was a problem with the fetch operation:",error);
        })
})

//按钮添加事件-登录
document.getElementById("login").addEventListener("click",()=>{
    alert("successful");
})