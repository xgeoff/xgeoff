// sidebarItem.gtpl (Groovy Markup Template)
def item = model.item ?: model

if (item?.type == 'directory') {
  li(class: 'folder') {
    span(item.name)
    ul {
      (item.children ?: []).each { child ->
        include template: 'partials/sidebarItem.gtpl', model: [item: child]
      }
    }
  }
} else if (item?.type == 'file') {
  li(class: 'file') {
    a(href: "/${item.path}", item.name)
  }
}

