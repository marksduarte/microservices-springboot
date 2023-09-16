FROM openjdk:17-slim

ARG PROFILE
ARG OPTS

ENV PROFILE=${PROFILE}
ENV OPTS=${OPTS}
ENV TZ=America/Sao_Paulo

WORKDIR /opt/cnbs-service

COPY build/libs/cnbs-service*.jar cnbs-service.jar

SHELL ["/bin/sh", "-c"]

RUN echo "America/Sao_Paulo" > /etc/timezone

EXPOSE 8080
EXPOSE 5005

CMD java ${OPTS} -jar cnbs-service.jar --spring.profiles.active=${PROFILE}
