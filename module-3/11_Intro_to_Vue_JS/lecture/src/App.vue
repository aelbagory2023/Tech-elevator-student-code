<template>
  <div class="main">
    <img alt="Vue logo" src="./assets/logo.png" />
    <!-- <HelloWorld msg="Welcome to Your Vue.js App" /> -->
    <ProductReview/>
  </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue';
import ProductReview from './components/ProductReview.vue';
export default {
   components: {
    ProductReview
  //   HelloWorld
   }
}
</script>

<style>
.main {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
