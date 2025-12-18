<!DOCTYPE html>
<html>
<head>
    <!-- Basic Page Needs
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
    <meta charset="utf-8">
    <title>${title}</title>
    <meta name="description" content="${title}">
    <meta name="author" content="${author}">

    <!-- Mobile Specific Metas
    –––––––––––––––––––––––––––––––––––––––––––––––––– -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- FONT
    –––––––––––––––––––––––––––––––––––––––––––––––––– -->
    <link href="//fonts.googleapis.com/css?family=Raleway:400,300,600" rel="stylesheet" type="text/css">

    <!-- CSS
    –––––––––––––––––––––––––––––––––––––––––––––––––– -->
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/skeleton.css">
    <link rel="stylesheet" href="css/style.css">

    <!-- Favicon
    –––––––––––––––––––––––––––––––––––––––––––––––––– -->
    <link rel="icon" href="images/favicon-32.png" sizes="32x32" type="image/png">


</head>
<body>
<main class="container prose">
${content}
</main>
<!-- Lightbox overlay (hidden until opened) -->
<div id="lightbox" role="dialog" aria-modal="true" aria-hidden="true">
  <img alt="" />
  <div class="lb-caption" aria-live="polite"></div>
</div>
<!-- Lightbox overlay (hidden until opened) -->
<div id="lightbox" role="dialog" aria-modal="true" aria-hidden="true">
  <img alt="" />
  <div class="lb-caption" aria-live="polite"></div>
</div>
</body>
<script src="js/lightbox.js"></script>
</html>