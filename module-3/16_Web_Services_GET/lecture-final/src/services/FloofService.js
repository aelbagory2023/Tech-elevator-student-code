import axios from 'axios'; 

//not going to set up an axios instance for this one, because we are only hitting one endpoint ever, for floofs

export default { 

    getFloof() { 
       return axios.get('https://randomfox.ca/floof/');
    }

}