FROM 192.168.46.142:5000/ylzbigdata/livingobjects/jre8:latest
VOLUME /tmp
ADD gittest.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8088