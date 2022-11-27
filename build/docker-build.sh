#!/bin/bash

docker rmi dockereddie/cloud-service-center-domain-router:1.0.0-SNAPSHOT
docker build --build-arg ACTIVE_PROFILE="STG" --build-arg PROJECT_FILE="cloud-service-center-domain-router-1.0.0-SNAPSHOT.jar" -f Dockerfile ../cloud-service-center-domain-router/target/ -t dockereddie/cloud-service-center-domain-router:1.0.0-SNAPSHOT

docker rmi dockereddie/cloud-service-center-domain-service:1.0.0-SNAPSHOT
docker build --build-arg ACTIVE_PROFILE="STG" --build-arg PROJECT_FILE="cloud-service-center-service-starter-1.0.0-SNAPSHOT.jar" -f Dockerfile ../cloud-service-center-domain-service/cloud-service-center-service-starter/target/ -t dockereddie/cloud-service-center-domain-service:1.0.0-SNAPSHOT

docker rmi dockereddie/cloud-service-k8s-cloud-consumer:1.0.0-SNAPSHOT
docker build --build-arg ACTIVE_PROFILE="STG" --build-arg PROJECT_FILE="cloud-service-consumer-cloud-starter-1.0.0-SNAPSHOT.jar" -f Dockerfile ../cloud-service-k8s-cloud-consumer/cloud-service-consumer-cloud-starter/target/ -t dockereddie/cloud-service-consumer-cloud-starter:1.0.0-SNAPSHOT

docker rmi dockereddie/cloud-service-k8s-cloud-provider:1.0.0-SNAPSHOT
docker build --build-arg ACTIVE_PROFILE="STG" --build-arg PROJECT_FILE="cloud-service-provider-cloud-starter-1.0.0-SNAPSHOT.jar" -f Dockerfile ../cloud-service-k8s-cloud-provider/cloud-service-provider-cloud-starter/target/ -t dockereddie/cloud-service-provider-cloud-starter:1.0.0-SNAPSHOT