Minimal example to reproduce issue with gretty groovy classloader.

This example reproduces the issue using Spring Boot.  

For an example without Spring Boot, please see: https://github.com/kpage/gretty-groovy-classloader-xml

Works: ./gradlew jettyRun
Fails with groovy ClassCastException: ./gradlew tomcatRun

Gretty also crashes and leaves tomcat running on port 8080.

It seems that the ClassCastException is caused by the gretty plugin modifying 
the groovy classes that are loaded for the web app.  Building a WAR and manually 
deploying to Tomcat works fine.
