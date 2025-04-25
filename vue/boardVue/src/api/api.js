import axios from 'axios'

const api = axios.create({
  baseURL: 'http://localhost:8081/boardts',  // Spring Boot API 기본 경로
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: false,  // 필요 시 true
})

export default api