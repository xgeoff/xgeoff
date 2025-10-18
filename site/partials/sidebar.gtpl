// sidebar.gtpl (Groovy Markup Template)
nav(class: "sidebar") {
  ul {
    // Determine the pages directory from model or fall back to site/pages
    def pagesDir = (model.pagesDir instanceof File) ? model.pagesDir : new File('site/pages')

    if (pagesDir?.exists() && pagesDir.directory) {
      // Build a hierarchical list of sidebar items (directories and files)
      def toSidebarItems
      toSidebarItems = { File dir, File root ->
        def items = []

        dir.eachFile { file ->
          if (file.directory) {
            def children = toSidebarItems(file, root)
            if (children) {
              items << [
                type    : 'directory',
                name    : file.name,
                children: children
              ]
            }
          } else if (file.name ==~ /(?i).*\.md|\.html?$/) {
            def relativePath = root.toPath().relativize(file.toPath()).toString().replace(File.separator, "/")
            def name = file.name.replaceFirst(/(?i)\.(md|html?)$/, "")
            items << [
              type: 'file',
              name: name,
              path: relativePath
            ]
          }
        }

        items.sort { a, b -> a.type <=> b.type ?: a.name.toLowerCase() <=> b.name.toLowerCase() }
      }

      def items = toSidebarItems(pagesDir, pagesDir)
      items.each { item ->
        include template: 'partials/sidebarItem.gtpl', model: [item: item]
      }
    }
  }
}

