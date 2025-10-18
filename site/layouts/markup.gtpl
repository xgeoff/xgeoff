yieldUnescaped '<!DOCTYPE html>'
html {
  head {
    // Basic Page Needs
    meta(charset: "utf-8")
    title(model.title)
    meta(name: "description", content: "")
    meta(name: "author", content: "")

    // Mobile Specific Metas
    meta(name: "viewport", content: "width=device-width, initial-scale=1")

    // FONT
    link(href: "//fonts.googleapis.com/css?family=Raleway:400,300,600",
         rel: "stylesheet", type: "text/css")

    // CSS
    link(rel: "stylesheet", href: "css/normalize.css")
    link(rel: "stylesheet", href: "css/skeleton.css")
    link(rel: "stylesheet", href: "css/style.css")

    // Favicon
    link(rel: "icon", type: "image/png", href: "images/favicon.png")
  }
  body {
    main(class: "container") {
      div(class: "prose") {
        // Handlebars {{{content}}} => unescaped HTML
        mkp.yieldUnescaped(model.content ?: "")
      }
    }
  }
}
