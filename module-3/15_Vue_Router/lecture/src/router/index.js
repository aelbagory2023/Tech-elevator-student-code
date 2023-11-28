import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import FriendlyView from '../views/FriendlyView.vue';
import UnfriendlyView from '../views/UnfriendlyView.vue';
import ProductsView from '../views/ProductsView.vue';
import ProductDetailView from '../views/ProductDetailView.vue';
const routes = [
  
  {
    path: '/',
    name: 'products',
    component: ProductsView
  },
{
  path: '/friendly',
  name: 'friendly',
  component: FriendlyView
},
{
  path: '/unfriendly',
  name: 'unfriendly',
  component: UnfriendlyView
},
{
  path: '/product/:id'
  name: 'product-detail'
  component: ProductDetailView
}

];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
