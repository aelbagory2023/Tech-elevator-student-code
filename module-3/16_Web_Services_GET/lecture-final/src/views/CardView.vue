<template>
  <div>
    <!-- if we are loading, display the hamster dance -->
    <div v-if="isLoading" class="loading">
      <img src="../assets/hamsterdance.gif"/>
    </div>
    <!-- if we are not loading, display the card detail-->
    <div v-else>
    <card-detail v-bind:card="card"/>
    <button v-on:click="getRandomFloof">New Fox Pic</button>
    <img v-bind:src="foxPicUrl"/>
    </div>
  </div>
</template>

<script>
import CardDetail from '../components/CardDetail.vue';
import boardService from '../services/BoardService.js';
import floofService from '../services/FloofService.js'; 

export default {
  components: {
    CardDetail
  },
  data() {
    return {
      card: {},
      isLoading:true,
      foxPicUrl: ''
    }
  },
  methods: { 
    getRandomFloof() { 
      floofService.getFloof().then((response) => {
        let responseData = response.data;
        this.foxPicUrl = responseData.image;
        //response data is going to look like this: 
        //{"image":"https:\/\/randomfox.ca\/images\/40.jpg","link":"https:\/\/randomfox.ca\/?i=40"}
      })
    }
  },
  created() {
    console.log(this.card); 
    console.log(
    boardService.getCard(this.$route.params.cardId)
      .then((response) => {
        this.card = response.data;
        console.log(response);
        console.log(this.card);
        this.isLoading = false; 
      })
    );
    this.getRandomFloof();
  }
};
</script>
