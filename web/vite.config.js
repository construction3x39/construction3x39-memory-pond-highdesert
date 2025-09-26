import { svelte } from '@sveltejs/vite-plugin-svelte'

export default {
  plugins: [svelte()],
  build: { outDir: 'build' },
  base: process.env.BASE_PATH || '/'
}
