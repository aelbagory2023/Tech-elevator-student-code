<template>
  <div class="main">
    <h2>Product Reviews for {{ name }}</h2>

    <p class="description">{{ description }}</p>

    <div class="well-display">
      <div class="well" v-on:click="filterValue = 0">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
      </div>

      <div class="well" v-on:click="filterValue = 1">
        <span class="amount">{{ numberOfOneStarReviews }}</span>
        1 Star Review{{ numberOfOneStarReviews === 1 ? '' : 's' }}
      </div>

      <div class="well" v-on:click="filterValue = 2">
        <span class="amount">{{ numberOfTwoStarReviews }}</span>
        2 Star Review{{ numberOfTwoStarReviews === 1 ? '' : 's' }}
      </div>

      <div class="well" v-on:click="filterValue = 3">
        <span class="amount">{{ numberOfThreeStarReviews }}</span>
        3 Star Review{{ numberOfThreeStarReviews === 1 ? '' : 's' }}
      </div>

      <div class="well" v-on:click="filterValue = 4">
        <span class="amount">{{ numberOfFourStarReviews }}</span>
        4 Star Review{{ numberOfFourStarReviews === 1 ? '' : 's' }}
      </div>

      <div class="well" v-on:click="filterValue = 5">
        <span class="amount">{{ numberOfFiveStarReviews }}</span>
        5 Star Review{{ numberOfFiveStarReviews === 1 ? '' : 's' }}
      </div>
    </div>

    <button v-on:click="toggleIsFormShown">Show Form</button>

    <form v-show="isFormShown">
      <div class="form-element">
          <label for="reviewer">Name:</label>
          <input id="reviewer" type="text" v-model="newReview.reviewer" />
      </div>
      <div class="form-element">
          <label for="title">Title:</label>
          <input id="title" type="text" v-model="newReview.title" />
      </div>
      <div class="form-element">
          <label for="rating">Rating:</label>
          <!-- NOTE: Use .number modifier here so newReview.rating is a number, not a string -->
          <select id="rating" v-model.number="newReview.rating">
              <option value="1">1 Star</option>
              <option value="2">2 Stars</option>
              <option value="3">3 Stars</option>
              <option value="4">4 Stars</option>
              <option value="5">5 Stars</option>
          </select>
      </div>
      <div class="form-element">
          <label for="review">Review:</label>
          <textarea id="review" v-model="newReview.review"></textarea>
      </div>
      <input type="submit" value="Save" 
        v-on:click.prevent="addNewReview">
      <input type="button" value="Cancel" v-on:click="resetForm">
  </form>





    <div
      class="review"
      v-bind:class="{ favorited: review.favorited }"
      v-bind:style="{ border : '1px solid red' }"
      v-bind:id="'cats'"
      v-for="review in filteredReviews"
      v-bind:key="review.id"
    >
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img
          src="../assets/star.png"
          v-bind:title="review.rating + ' Star Review'"
          class="ratingStar"
          v-for="n in review.rating"
          v-bind:key="n"
        />
      </div>
      <h3>{{ review.title }}</h3>

      <p>{{ review.review }}</p>

      <p>
        Favorite?
        <input type="checkbox" v-bind:id="'favorite_' + review.id" v-model="review.favorited" />
      </p>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      name: 'Head First Design Patterns',
      description:
        'A brain friendly guide to building extensible and maintainable object-oriented software.',
      nextReviewId: 1005,
      newReview: {},
      isFormShown: false,
      filterValue: 0,
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
          reviewer: 'Carmen',
          title: 'Pattern complexity gone!',
          review:
            'I struggled for years to understand patterns and how to implement the design and how them. This is by far the best book to learn design patterns. I would give this 10 stars if I could.',
          rating: 5,
          favorited: false
        },
        {
          id: 1002,
          reviewer: 'J. King',
          title: 'Not for me',
          review:
            'The content is thorough and well described. However, the format just doesn\'t work for me. I need something more traditional.',
          rating: 1,
          favorited: false
        },
        {
          id: 1003,
          reviewer: 'Safa H.',
          title: 'Good for beginners',
          review:
            'Good introduction to design patterns especially if you have never used them before or are relatively new to OO principles.',
          rating: 3,
          favorited: false
        },
        {
          id: 1004,
          reviewer: 'L Wang',
          title: 'Entertaining',
          review:
            'If you are new to design patterns I HIGHLY recommend this book. You might think it\'s not "serious enough" at first. But as you go through it things just stick. It makes learning enjoyable.',
          rating: 4,
          favorited: false
        }
      ]
    };
  },
  methods: {
    /*
     * Returns the next review id. Normally, a database would assign a unique id for the review.
     * This code simulates that since there's no database in this example.
     */
    getNextReviewId() {
      return this.nextReviewId++;
    },
    addNewReview() {
      //take the new review object and put it in the review collection
      this.newReview.id = this.getNextReviewId();
      this.reviews.unshift(this.newReview);
      this.resetForm();
    },
    resetForm() { 
      this.newReview = {};
      this.toggleIsFormShown();
    },
    toggleIsFormShown() {
      this.isFormShown = !this.isFormShown;
    }
  },
  computed: {
    averageRating() {
      if (this.reviews.length === 0) {
        return 0;
      }

      let sum = this.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);
      return (sum / this.reviews.length).toFixed(2);
    },
    numberOfOneStarReviews() {
      const oneStarReviews = this.reviews.filter((review) => {
        return review.rating === 1;
      });
      return oneStarReviews.length;
    },
    numberOfTwoStarReviews() {
      const twoStarReviews =  this.reviews.filter((review) => {
        return review.rating === 2;
      });
      return twoStarReviews.length;
    },
    numberOfThreeStarReviews() {
      const threeStarReviews =  this.reviews.filter((review) => {
        return review.rating === 3;
      });
      return threeStarReviews.length;
    },
    numberOfFourStarReviews() {
      const fourStarReviews =  this.reviews.filter((review) => {
        return review.rating === 4;
      });
      return fourStarReviews.length;
    },
    numberOfFiveStarReviews() {
      const fiveStarReviews =  this.reviews.filter((review) => {
        return review.rating === 5;
      });
      return fiveStarReviews.length;
    },
    filteredReviews() { 
      //filter the reviews collection in the data object, and if the rating of the review matches the filter value, put it in the filteredCollectionOfReviews variable 

      let filteredCollectionOfReviews = 
        this.reviews.filter((item) => {
        return item.rating === this.filterValue;
      })

      //if the filter value is 0, we want all of the reviews returned
      if(this.filterValue === 0 ) { 
        filteredCollectionOfReviews = this.reviews;
      }

      //return the filtered collection of reviews from above
      return filteredCollectionOfReviews;
    }
  }
};
</script>

<style scoped>
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

.amount:hover {
  cursor: pointer;
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

.form-element {
  margin-top: 10px;
}

.form-element label {
  display: block;
}

.form-element select {
  height: 30px;
  width: 300px;
}

.form-element textarea {
  height: 60px;
  width: 300px;
}

form input[type=button] {
  width: 100px;
}

form input[type=submit] {
  width: 100px;
  margin-right: 10px;
}
</style>

