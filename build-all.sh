
cd core/pricingservice; sudo ./gradlew clean publishToMavenLocal build distDocker; cd -
cd core/productservice; sudo ./gradlew clean publishToMavenLocal build distDocker; cd -
cd resources/browseapi; sudo ./gradlew clean build distDocker; cd -
cd infra/discovery-server; sudo ./gradlew clean build distDocker; cd -
cd infra/edge-server; sudo ./gradlew clean build distDocker; cd -
cd infra/monitor-dashboard;  sudo ./gradlew clean build distDocker; cd -
cd infra/turbine; sudo ./gradlew clean build distDocker; cd -