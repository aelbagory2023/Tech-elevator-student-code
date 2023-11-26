<template>
  <div class="book-container">
    <div class="reading-list">
    <BookCard v-for="book in books" :key="book.isbn" :book="book" />
  </div>
  </div>
</template>

<script>
import BookCard from './BookCard.vue'; 
export default {
  components: {
    BookCard
  },
  computed: {
    books() {
      return this.$store.state.books;
    }
  }
}
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>