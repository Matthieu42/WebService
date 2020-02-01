FROM openjdk:8-jdk-alpine

COPY . /app

RUN ["javac", "-d", "/app/bin/appSOAP",  "/app/src/appSOAP/Main.java","/app/src/appSOAP/Chambre.java","/app/src/appSOAP/Hotel.java"]
CMD ["java", "-cp", "/app/bin", "appSOAP.Main"]