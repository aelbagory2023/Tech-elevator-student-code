<template>
<h1>Product Reviews for {{ bookname }}</h1>
<p> {{ description }}</p>

<div v-for="item in reviews" v-bind:key=item.id class="review">
<div class="rating">
    <h4> {{ item.reviewer }}</h4>
<img src="../assets/star.png" v-for="number in item.rating" v-bind:key="number">
<h3> {{ item.title }}</h3>
<p> {{ item.review }}</p>
</div> 
    
<div>
</div>
</template>


<script>
export default {
    name: 'productReview',
    data() {
    return {
        bookname: 'Underwater Basket Weaving for cat ladies',
        description: 'A HELPful guide to create decorative baskets',
        reviews: [
    {
id: 1000,
        reviewer: 'R Pérez',
        title: 'Approachable pattern guide',
        review:
          'I love the uncomplicated, informal narrative style. I highly recommend this text for anyone trying to understand Design Patterns in a super simple way.',
        rating: 4

    },
    {
id: 1001,
        reviewer: 'ahmed e',
        title: 'my review',
        review:
        'what a review',
         rating: 3

    }  
    
    ]
    }
    }
}
</script>

<style>


</style>