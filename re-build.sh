#!/bin/bash
readonly STACK="tomcatpostgres"

if [[ "$(docker ps -a --filter=\"name=${STACK}\" -q 2> /dev/null)" != "" ]]; then
   docker rm -f -v ${STACK}_storage-db-data_1 ${STACK}_srv-postgres_1 ${STACK}_app-web_1
fi

docker-compose up --build
