import axios from 'axios';

const http = axios.create({
  baseURL: 'http://localhost:3000'
});

export default {

  getMessage(messageId) {
    return http.get(`/messages/${messageId}`)
  }
}