import axios from 'axios';
//import the axios library and call it axios (imaginative)

//create an axios instance and set a baseURL
//setting that as const "http"
const http = axios.create({
  baseURL: "http://localhost:3000"
});

//in this export are all the functions we can use for API calls
export default {

  getBoards() {
    return http.get('/boards');
  },

  getBoard(boardId) {
    return http.get(`/boards/${boardId}`)
  },

  getCard(cardId) {
    return http.get(`/cards/${cardId}`)
  }

}
