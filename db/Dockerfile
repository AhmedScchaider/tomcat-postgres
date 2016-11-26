FROM postgres:9.6.1

MAINTAINER Martin Simoneau

#
# Cette image (officielle) permet d'exécuter un PSQL au démarrage.
# Voir le dépôt officiel de Postgres à l'URL:
#    https://hub.docker.com/_/postgres/
#
ADD init.sql /docker-entrypoint-initdb.d/
