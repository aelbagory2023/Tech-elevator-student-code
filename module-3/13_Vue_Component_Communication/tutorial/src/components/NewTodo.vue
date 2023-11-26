<template>
<section class="new-todo">
    <form>
      <input type="text" name="input-name" placeholder="Name">
      <select name="select-category">
        <option value="" disabled>--- Select a category ---</option>
        <option value="Home">Home</option>
        <option value="Work">Work</option>
      </select>
      <button>Add</button>
    </form>
  </section>
</template>

<script>
export default {
    methods: {
  saveTodo() {
    this.newTodo.done = false;
    this.$store.commit('ADD_NEW_TODO', this.newTodo);
    this.newTodo = {};
  }
}
}
</script>

<style>
.new-todo {
  width:450px;
  background: #fff;
  margin: auto;
  font-family: 'Roboto Condensed', sans-serif;
  border-radius: 10px;
}
input, select, button {
  padding: 5px 5px;
  margin: 5px;
}
</style>