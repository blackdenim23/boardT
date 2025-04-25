import { createRouter, createWebHistory } from 'vue-router'
import BoardView from '../views/BoardView.vue'

export default createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/posts', name: 'board', component: BoardView }
  ]
});


