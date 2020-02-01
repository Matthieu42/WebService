FROM openjdk:8-jdk-alpine

COPY . /app

EXPOSE 2000

RUN ["javac", "-d", "/app/bin/appSOAP",  "/app/src/appSOAP/Main.java","/app/src/appSOAP/Chambre.java","/app/src/appSOAP/Hotel.java"]
CMD ["java", "-cp", "/app/bin", "appSOAP.Main"]