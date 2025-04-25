import api from './api'  // 위에서 만든 axios 인스턴스 import

// 게시글 목록 조회
export const fetchPosts = () => {
  return api.get('/api/posts')  // 자동으로 baseURL + /api/posts
}
