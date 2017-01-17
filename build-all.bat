pushd micro-services\pricingService &                call gradlew clean publishToMavenLocal & popd
pushd micro-services\productService &         		 call gradlew clean publishToMavenLocal & popd
pushd orchestrator\productCompositeService	& 		 call gradlew clean build & popd

pushd gateway\discovery-server &            call gradlew clean build & popd
pushd gateway\edge-server &                 call gradlew clean build & popd
pushd gateway\monitor-dashboard &           call gradlew clean build & popd
pushd gateway\turbine &                     call gradlew clean build & popd