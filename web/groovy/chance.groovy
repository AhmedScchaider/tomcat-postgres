def num = Math.random()

html.html {
    head {
        title('Jour de chance ?')
    }
    body {
        if (num > 0.95) {
            h2('Vous êtes chanceux aujourd\'hui !')
        } else {
            h2('La vie continue...')
        }
        p("$num")
        h3{ a(href:'javascript:history.go(0)', 'Essayez à nouveau') }
    }
}
