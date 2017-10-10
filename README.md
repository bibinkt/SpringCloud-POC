<h4>Steps to install</h4>

1)	Clone the repo. using git clone https://github.com/bibinkt/SpringCloud-POC.git <br>
2)	cd SpringCloud-POC <br>
3)	Build-all.bat/build-all.sh <br>
4)	Start-all.bat/"sudo .gradlew bootRun" for each service <br>

The above bat files will build and deploy all the service including  Edge server [Zull & Ribbon] , Discovery 
server [Eureka], Micro-services [product & price] and a composite service.

As long as you are not changing the default ports -

To access Eureka server : <b>http://localhost:8761/</b>  - This will give you all the other services information 
registered with discovery service.

To access  the product service through the edge service : <b>http://localhost:8765/productcomposite/product/1</b> - 


<h4>SPRING CLOUD AND NETFLIX OSS</h4>

  Spring Cloud is a new project in the spring.io family. To a large extent Spring Cloud 1.0 is based on 
  components from Netflix OSS. Spring Cloud integrates the Netflix components in the Spring environment 
  in a very nice way using auto configuration and convention over configuration
  
  The aim of this POC is to make you familiarize with some of the essential Spring & Netflix OSS 
  components when it comes to micro-services development & deployment in cloud.


  Below are the components covered far in this POC
  -------------------------------------------------------------

  Netflix Eureka - Service Discovery Server Netflix Eureka allows microservices to register themselves 
                   at runtime as they appear in the system landscape.

  Netflix Ribbon - Dynamic Routing and Load Balancer Netflix Ribbon can be used by service consumers to lookup 
                   services at runtime. Ribbon uses the information available in Eureka to locate appropriate 
                   service instances. If more than one instance is found, Ribbon will apply load balancing to 
                   spread the requests over the available instances. Ribbon does not run as a separate service 
                   but instead as an embedded component in each service consumer.

  Netflix Zuul -  Edge Server Zuul is the gatekeeper to the outside world, not allowing any 
                  unauthorized external requests pass through. Zulu also provides a well known entry point to
                  the microservices in the system landscape. Using dynamically allocated ports is convenient to 
                  avoid port conflicts and to minimize administration but it makes it of course harder for any 
                  given service consumer. Zuul uses Ribbon to lookup available services and routes the external 
                  request to an appropriate service instance.
   
   The enitire application architecture has been given in below diagram.
   
   <img src="https://github.com/bibinkt/SpringCloud-POC/blob/master/SpringCloud.png" width="100%" class="changed_alt changed">

  
   Below are the immediate next steps and pull request are always welcome if you are ready to implement below comp 
   or any other usefull feature.
   -------------------------------------------------
     1) OAth 2.0 implementation
     2) Circuite breaker
     3) Cloude deployment using Docker container
     4) ...
   
   
   
   
   
   
   
   
   
   
   
   
                     
                     














