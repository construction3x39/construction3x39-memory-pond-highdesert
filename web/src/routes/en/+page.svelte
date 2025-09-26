<script>
  import sitemap from '/content/sitemap.json';
</script>

<h1>🌌 Pond Highdesert Wiki</h1>
<p>Explore the 50-year educational constellation below.</p>

<div class="constellation">
  <h2>Knowledge Constellation</h2>
  <ul class="tutorial-list">
    {#each sitemap as p}
      <li>
        <a href={`/en/wiki/${p.id}/`} class="tutorial-link">
          {p.title}
        </a>
      </li>
    {/each}
  </ul>
</div>

<style>
  .constellation {
    max-width: 800px;
    margin: 2rem auto;
    padding: 2rem;
  }
  
  .tutorial-list {
    list-style: none;
    padding: 0;
  }
  
  .tutorial-link {
    display: block;
    padding: 1rem;
    margin: 0.5rem 0;
    background: #f8f9fa;
    border: 2px solid #e1e5e9;
    border-radius: 8px;
    text-decoration: none;
    color: #2c5e2e;
    transition: all 0.3s ease;
  }
  
  .tutorial-link:hover {
    border-color: #4a7c59;
    background: #e8f5e8;
    transform: translateY(-2px);
  }
</style>
