FROM openjdk:17-jdk-alpine
ARG app_name=hw_01-wrap-app-in-docker-image.jar
ARG target_file=/target/${app_name}
ENV app_file=/app/${app_name}
COPY ${target_file} ${app_file}
ENV TZ=Europe/Moscow
EXPOSE 8000
CMD java -jar ${app_file}
