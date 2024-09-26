<template>
  <h1>User List</h1>
  <ul v-if="users.length">
    <li v-for="user in users" :key="user.id">
      {{user.username}} - {{user.password}}
    </li>
  </ul>
  <p v-else>No users found.</p>
</template>

<script>
  import {ref,onMounted} from 'vue';
  import {getUsers} from '../api/userService';

  export default{
    name: 'UserList',
    setup(){

      const users = ref([]);

      const fetchUsers = async() =>{
        try{
          const response = await getUsers();
          users.value=response.data;
        }catch(error){
          console.error('Error fetching users:',error);
        }
      };

      onMounted(()=>{
        fetchUsers();
      });

      return{
        users,
      };
    },
  };

</script>

<style scoped>

</style>