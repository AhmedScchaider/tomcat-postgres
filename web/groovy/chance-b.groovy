def num = Math.random()
def message

if (num > 0.95) {
    message = 'Vous êtes chanceux aujourd\'hui !'
} else {
    message = 'La vie continue...'
}

println """\
<html>
  <head>
    <title>Jour de chance ?</title>
  </head>
  <body>
    <h2>$message</h2>
    <p>$num</p>
    <h3>
      <a href='javascript:history.go(0)'>Essayez à nouveau</a>
    </h3>
  </body>
</html>
"""
