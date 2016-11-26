// Placer org.postgresql:postgresql:9.4.1211.jre7.jar dans Tomcat_home/lib

import javax.naming.InitialContext
import groovy.sql.Sql

def debut = System.currentTimeMillis()
def postgres = 'java:/comp/env/jdbc/postgres'
def contexte = new InitialContext()
def selectionPersonnes = '''
    SELECT prenom, nomFamille FROM personnes;
'''

def sql = new Sql(contexte.lookup(postgres))

html.html {
    head {
        title('Test de pool de connexion avec Postgres')
    }
    body {
        h1('Test de pool de connexion avec Postgres')
        h2('Résultat')
        sql.eachRow selectionPersonnes, { rangee ->
            p("$rangee.prenom $rangee.nomFamille")
        }
        h5("Temps en millisecondes : ${System.currentTimeMillis() - debut}")
    }
}

sql.close()
