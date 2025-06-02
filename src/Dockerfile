FROM ghcr.io/encante/arch-temurin-23:1.0
LABEL author = "Enc"

WORKDIR /app

COPY build/libs/HR4Tg-0.0.1.jar app.jar

# Run the app
CMD ["java", "-jar", "app.jar"]