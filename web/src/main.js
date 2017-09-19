// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App.vue'    // 路由挂载
import Routers from './router/index.js'       // 路由列表
import iView from 'iview'
import 'iview/dist/styles/iview.css'    // 使用 CSS

Vue.use(VueRouter)

Vue.use(iView)

new Vue({
  el: '#app',
  router: Routers,
  render: h => h(App)
})
