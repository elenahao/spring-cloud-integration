FROM tomcat

MAINTAINER haoxueying xueying.hao@mtime.com

ADD target/*.jar microservice-discovery-eureka.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "microservice-discovery-eureka.jar"]