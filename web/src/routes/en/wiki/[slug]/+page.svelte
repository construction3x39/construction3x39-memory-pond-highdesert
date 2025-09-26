<script>
  import * as pages from '$lib/generated';
  import sitemap from '/content/sitemap.json';
  
  export let params;
  let Comp;
  
  $: Comp = pages[params.slug]?.default;
</script>

{#if Comp}
  <svelte:component this={Comp} {sitemap} />
{:else}
  <h1>Page not found</h1>
  <p>The page you're looking for doesn't exist.</p>
  <a href="/en/">← Back to home</a>
{/if}
