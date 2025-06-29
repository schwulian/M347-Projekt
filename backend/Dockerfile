
FROM gradle:8.0-jdk17 AS builder
WORKDIR /application

COPY build.gradle settings.gradle gradle.properties ./
COPY gradle ./gradle

RUN gradle build --no-daemon || true

COPY . .

RUN gradle clean build --no-daemon


FROM openjdk:17-slim AS runner
WORKDIR /application

COPY --from=builder /application/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
