# Comando Interativo totalmente
mvn archetype:generate

# Comando não interativo
mvn archetype:generate -DgroupId=com.topicos -DartifactId=olamundo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false

#Compilar o seu código fonte
mvn compile
# Testar o código
mvn test

# Empacotar num arquivo JAR
mvn package

# Compila, empacota, roda os testes e 
# coloca no repositório local

mvn install
#Construir o projeto, sem rodar os testes 
mvn clean package -DskipTests

#dependência do Maven
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>