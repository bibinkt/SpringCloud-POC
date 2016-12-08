

     SPRING CLOUD AND NETFLIX OSS
        
     Spring Cloud is a new project in the spring.io family.To a large extent Spring Cloud 1.0 is based on 
     components from Netflix OSS.Spring Cloud integrates the Netflix components in the Spring environment 
     in a very nice way using auto configuration and convention over configuration
     
     The aim of this POC is to make you familiarize with some of the essential Spring & Netflix OSS 
     components when it comes to micro-services developemnt & deployment in cloud.
     
     Below tables list out the all the neccessary you will deal with in spring cloud micr-service 
     implementaion . 
     
     
     
     Below are the components covered far in this POC
     -------------------------------------------------------------
     
     Netflix Eureka - Service Discovery Server Netflix Eureka allows microservices to register themselves 
                      at runtime as they appear in the system landscape.

     Netflix Ribbon - Dynamic Routing and Load Balancer Netflix Ribbon can be used by service consumers to lookup 
                     services at runtime. Ribbon uses the information available in Eureka to locate appropriate 
                     service instances. If more than one instance is found, Ribbon will apply load balancing to 
                     spread the requests over the available instances. Ribbon does not run as a separate service 
                     but instead as an embedded component in each service consumer.

     Netflix Zuul -  Edge Server Zuul is (of course) our gatekeeper to the outside world, not allowing any 
                     unauthorized external requests pass through. Zulu also provides a well known entry point to
                     the microservices in the system landscape. Using dynamically allocated ports is convenient to 
                     avoid port conflicts and to minimize administration but it makes it of course harder for any 
                     given service consumer. Zuul uses Ribbon to lookup available services and routes the external 
                     request to an appropriate service instance.
                     
     
     The enitire application architecture has been given in below diagram.
     
     Below are the immediate next steps and pull request are always welcome if you are ready to implement below 
     comp or any other usefull feature.
     -------------------------------------------------
     1) OAth 2.0 implementation
     2) Circute breaker
     3) Cloude deployment using Docker container
     4) ...
