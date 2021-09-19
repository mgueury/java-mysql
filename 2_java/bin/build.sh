docker build -t java-mysql .
docker tag java-mysql:latest eu-frankfurt-1.ocir.io/fr03kzmuvhtf/marc/java-mysql:latest
docker images | grep java-mysql 

