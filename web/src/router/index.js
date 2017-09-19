import Vue from 'vue'
import Router from 'vue-router'
import Manage from '@/components/Manage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Manage',
      component: Manage
    }
  ]
})
