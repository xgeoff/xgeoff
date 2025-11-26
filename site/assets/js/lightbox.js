// lightbox.js
(() => {
  const overlay = document.getElementById('lightbox');
  if (!overlay) return; // gracefully skip if no lightbox div

  const overlayImg = overlay.querySelector('img');
  const overlayCaption = overlay.querySelector('.lb-caption');

  // Open when any gallery image is clicked
  document.querySelectorAll('.gallery img').forEach(img => {
    img.addEventListener('click', () => {
      const figure = img.closest('figure');
      const captionEl = figure ? figure.querySelector('figcaption') : null;

      overlayImg.src = img.src;
      overlayImg.alt = img.alt || '';
      overlayCaption.textContent = captionEl ? captionEl.textContent : (img.alt || '');

      overlay.classList.add('open');
      overlay.setAttribute('aria-hidden', 'false');
      document.body.classList.add('noscroll');
    });
  });

  function closeLightbox() {
    overlay.classList.remove('open');
    overlay.setAttribute('aria-hidden', 'true');
    document.body.classList.remove('noscroll');
    overlayImg.src = '';
  }

  overlay.addEventListener('click', closeLightbox);

  document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape' && overlay.classList.contains('open')) {
      closeLightbox();
    }
  });
})();
