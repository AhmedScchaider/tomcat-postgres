FROM tomcat:9-jre8

MAINTAINER Martin Simoneau

# Copier les .jar nécessaires à Postgres et Groovy.
COPY postgresql-9.4.1212.jar /usr/local/tomcat/lib/
COPY groovy-all-2.4.7.jar /usr/local/tomcat/lib/

# Copier les groovlets de Louis
COPY ./groovy /usr/local/tomcat/webapps/groovy

# Démarrer tomcat.
CMD ["catalina.sh", "run"]
