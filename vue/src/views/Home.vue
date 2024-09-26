<script>
  import UserList from '../components/UserList.vue';

  let newVar = {
    name: "Home",
    components:{
      UserList,
    },
  };
</script>

<template>
  <div>
    <h1>Home Page</h1>
    <UserList/>
  </div>
</template>

<style scoped>

</style>