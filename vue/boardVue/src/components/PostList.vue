<template>
  <table border="1" cellpadding="8">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="post in posts" :key="post.id">
        <td>{{ post.id }}</td>
        <td>{{ post.title }}</td>
        <td>{{ post.author }}</td>
        <td>{{ post.createdAt }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script setup>
defineProps(['posts']) // 부모로부터 posts를 props로 받음
</script>