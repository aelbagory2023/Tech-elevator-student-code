<template>
  <div>
    <h1>Card Detail: {{ card.title }}</h1>
    <p> {{ card.description }}</p>
  </div>
</template>

<script>

export default {
  props: ['card']
};
</script>
