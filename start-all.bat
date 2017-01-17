start /D gateway\discovery-server	             gradlew bootRun
start /D gateway\edge-server                  gradlew bootRun
start /D gateway\monitor-dashboard	             gradlew bootRun
start /D gateway\turbine                  gradlew bootRun

start /D micro-services\productService                 gradlew bootRun
start /D micro-services\pricingService          gradlew bootRun
start /D orchestrator\productCompositeService                  gradlew bootRun
