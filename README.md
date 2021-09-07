## Gittigidiyor Java Spring Bootcamp Fourth Homework

# How to Run?

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar -Dspring.profiles.active=test target/dev-patika-app-app-0.0.1.war
or
        mvn spring-boot:run -Drun.arguments="spring.profiles.active=test"
```
* Check the stdout or boot_example.log file to make sure no exceptions are thrown

Once the application runs you should see something like this

```
2021-09-05 17:31:23.091  INFO 19387 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer  : Tomcat started on port(s): 8080 (http)
2021-09-05 17:31:23.097  INFO 19387 --- [           main] dev.patika.app.AppApplication             : Started Application in 22.285 seconds (JVM running for 23.032)
```
