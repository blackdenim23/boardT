<template>
  <div>
    <h2>게시판 목록</h2>
    <PostList :posts="posts" />
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { fetchPosts } from '../api/posts'
import PostList from '../components/PostList.vue'

const posts = ref([])

onMounted(async () => {
  try {
    const response = await fetchPosts()
    console.log('✅ API 응답 데이터:', response.data) 
    posts.value = response.data
  } catch (error) {
    console.error('게시글 조회 실패:', error)
  }
})
</script>