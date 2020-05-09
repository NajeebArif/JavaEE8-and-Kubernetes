FROM narif/wildfly-admin:1

LABEL maintainer="najeeb.oo7.dd@gmail.com"

COPY target/cloudnative.war $DEPLOYMENT_DIR