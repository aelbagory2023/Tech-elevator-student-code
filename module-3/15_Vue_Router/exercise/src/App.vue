<template>
  <div id="book-app">
    <nav>
      <router-link v-bind:to="{name: 'Home'}">Home</router-link> |
  <router-link v-bind:to="{name: 'MyBooksView'}">My Books</router-link>
       <router-view />
    </nav>
  </div>
</template>

<script>

export default {
  
}
</script>

<style>
#book-app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}
</style>
