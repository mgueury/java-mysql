FROM openjdk:11
WORKDIR /app
COPY Mysql.java /app
COPY bin/java.sh /app
ADD lib /app/lib
RUN javac Mysql.java
# CMD ["java","-classpath","lib/*:.", "Mysql","jdbc:mysql://mycluster.default.svc.cluster.local:6446/db1?user=root&password=javaMySQL1"]
RUN apt-get -y update
RUN apt-get -y install vim
CMD tail -f /dev/null

