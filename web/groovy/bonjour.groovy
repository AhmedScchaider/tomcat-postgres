
// Ajouter le jar groovy dans le répertoire WEB-INF/lib de l'application

if (!session) {
    session = request.getSession(true)
}

if (!session.counter) {
    session.counter = 1
}

html.html { // html is implicitly bound to new MarkupBuilder(out)
  head {
      title('Groovy Servlet')
  }
  body {
    p("Bonjour à vous...")

    p("Nous sommes le ${new Date().format('d MMMM yyyy à HH:mm:ss')}")

    p("L'adresse IP du requérant est ${request.remoteHost}")

    p("Le compteur de session est ${session.counter}")
  }
}
session.counter = session.counter + 1
