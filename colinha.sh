#Interativo totalmente
mvn archetype:generate

#Ola mundo não interativo
mvn archetype:generate -DgroupId=com.topicos -DartifactId=olamundo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false

#Ola mundo Interativo
mvn archetype:generate

#Construir o projeto, sem rodar os testes 
mvn clean package -DskipTests

#dependência do Maven
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>