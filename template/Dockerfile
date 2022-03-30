FROM registry.hub.docker.com/library/maven:3-openjdk-11 as builder

WORKDIR /build
COPY . ./
RUN mvn -B -s settings.xml package

FROM registry.hub.docker.com/library/openjdk:11

WORKDIR /opt/app
COPY --from=builder /build/target/template.jar ./

CMD [ "java", "-jar", "template.jar" ]
