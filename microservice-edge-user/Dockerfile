FROM tomcat

MAINTAINER haoxueying xueying.hao@mtime.com

ADD target/*.jar microservice-edge-user.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "microservice-edge-user.jar"]