<template>
    <h1>Add Review</h1>
    <add-review v-bind:productId="productIdentifier" greeting="Wow, you are adding a review!" />
</template>

<script>
import AddReview from '../components/AddReview.vue';

export default {
    components: {
        AddReview
    },
    computed: {
        productIdentifier() {
            return this.$route.params.id
        }
    }
};

</script>
