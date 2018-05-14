# rule-util
Standalone utility classes that can be used in drools workbench.


Start drools workbench and then kie execution server

docker run -p 8080:8080 -p 8001:8001 -d --name drools-workbench jboss/drools-workbench-showcase:latest

docker run -p 8180:8080 -d --name kie-server --link drools-workbench:kie_wb jboss/kie-server-showcase:latest
