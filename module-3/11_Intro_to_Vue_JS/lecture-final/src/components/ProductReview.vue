<template>
    <h1>Product Reviews for {{ bookName }}</h1>
    <p>{{ description }}</p>

    <div class="well-display">
    <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
    </div>

    <div class="well">
            <span class="amount">{{ numberOfOneStarReviews }}</span>
            1 Star Review
        </div>

        <div class="well">
            <span class="amount"><!-- data binding goes here --></span>
            2 Star Review
        </div>

        <div class="well">
            <span class="amount"><!-- data binding goes here --></span>
            3 Star Review
        </div>

        <div class="well">
            <span class="amount"><!-- data binding goes here --></span>
            4 Star Review
        </div>

        <div class="well">
            <span class="amount"><!-- data binding goes here --></span>
            5 Star Review
        </div>

    </div>

    <div v-for="item in reviews" v-bind:key="item.id" class="review">
        <h4>{{ item.reviewer }}</h4>
        <div class="rating">
            <img src="../assets/star.png" v-for="number in item.rating" v-bind:key="number">
        </div>
        <h3>{{ item.title }}</h3>
        <p>{{ item.review }}</p>
        <p>Favorite? 
            <input type="checkbox" v-model="item.favorited"/>
        </p>
    </div>
</template>

<script>
export default { 
    name: 'productReview',
    data() {
        return {
            bookName: 'Underwater Basket Weaving for Cat Ladies', 
            description: 'A helpful guide to creating decorative baskets out of cat hair while swimming.',
            reviews: [
                {
                    id: 1000,
                    reviewer: 'R Pérez',
                    title: 'Approachable pattern guide',
                    review:
                        'I love the uncomplicated, informal narrative style. I highly recommend this text for anyone trying to understand Design Patterns in a super simple way.',
                    rating: 4,
                    favorited: false
                },
                {
                    id: 1001,
                    reviewer: 'T Brenneison',
                    title: 'I never knew I needed this',
                    review:
                        'A slightly soggy activity, but my cats loved participating.',
                    rating: 3,
                    favorited: false
                },
                {
                    id: 1002,
                    reviewer: 'Philco',
                    title: 'SCREMMMMMM',
                    review:
                        'AHHHHHHHHHHHHHHHH',
                    rating: 1,
                    favorited: false
                },
            ]
        }
    },
    computed: { 
        averageRating() {
            let sum = this.reviews.reduce((total, review) => {
                return total + review.rating;
            }, 0);
        
            let average = sum / this.reviews.length;
            return average.toFixed(1); 
        },
        numberOfOneStarReviews() { 
            let oneStarReviews = this.reviews.filter((review) =>{
                if(review.rating === 1) { 
                    return true; 
                }
            });
            return oneStarReviews.length;
        }
    }
}
</script>

<style>
.main {
  margin: 1rem 0;
}

.well-display {
  display: flex;
  justify-content: space-around;
  margin-bottom: 1rem;
}

.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
  padding: 0.25rem;
}
.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

.favorited {
  background-color: lightyellow;
}

.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

.rating img {
  height: 100%;
}

.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}
.review p {
  margin: 20px;
}

.review h3 {
  display: inline-block;
}

.review h4 {
  font-size: 1rem;
}
</style>