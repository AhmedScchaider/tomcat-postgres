**tomcat-postgres**

Attention j'ai utilisé la dernière version de Postgres(9.6.1) ainsi que la dernière version de Tomcat(Apache Tomcat/9.0.0.M13).

La communication entre les conteneurs ne se fait PAS via localhost, j'ai donc modifié l'URI de connextion entre Tomcat et Postgres. On utilise le nom du conteneur lié plustôt que le nom de l'hôte:

```
<Resource name="jdbc/postgres" auth="Container"
          type="javax.sql.DataSource" driverClassName="org.postgresql.Driver"
          url="jdbc:postgresql://srv-postgres:5432/louis"
          username="louis" password="" maxActive="20" maxIdle="10"
          maxWait="-1"/>
```

Pour mettre en place le stack simplement entrer la commande suivante lorsque vous êtes placé dans le répertoire tomcat-postgres:

```sh
 $ ./re-build.sh
```

Dans votre fureteur acccéder à l'URL suivante: **[http://localhost:8081/groovy/bd.groovy](http://localhost:8081/groovy/bd.groovy)**
