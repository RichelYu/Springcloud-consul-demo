FROM java:8

EXPOSE 8080

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar ./demo.jar

RUN chmod g+rwx -R .

CMD ["java","-jar","demo.jar"]