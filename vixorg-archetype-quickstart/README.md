## Archetype [vixorg-archetype-quickstart](https://github.com/VixOrg/vixorg-archetypes/tree/master/vixorg-archetype-quickstart)
This archetype is great for generating simple java maven projects with most commonly used dependencies.
The generated project will contain an example application class (with `public static Main(String... args)` method) and an example <a href="https://junit.org/junit5/" target="_blank">JUnit 5</a> test case. It will also have the logging configured (using <a href="http://logback.qos.ch/" target="_blank">logback</a> and <a href="http://www.slf4j.org/" target="_blank">slf4j</a>) and a sample code for reading and initializing the `application.properties`.

### Usage
VixOrg Archetypes Bundle installation and usage is described [here](https://github.com/VixOrg/vixorg-archetypes/blob/master/README.md#installation)

### Project Structure

```
sample-project
│
├── .gitignore
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── ExampleApp.java
    │   └── resources
    │       ├── application.properties
    │       └── logback.xml
    └── test
        └── java
            └── ExampleAppTest.java
```

### Project Dependencies
| Name | Artifact | Version |
|-|-|-:|
| <a href="https://jdk.java.net/14/" target="_blank">Java</a> | OpenJDK | 14+ |
| <a href="https://projectlombok.org/" target="_blank">Lombok</a> | org.projectlombok : lombok | 1.18.12 |
| <a href="https://commons.apache.org/proper/commons-lang/" target="_blank">Apache Commons Lang</a> | org.apache.commons : commons-lang3 | 3.11 |
| <a href="https://commons.apache.org/proper/commons-math/" target="_blank">Apache Commons Math</a> | org.apache.commons : commons-math3 | 3.2 |
| <a href="http://commons.apache.org/proper/commons-io/" target="_blank">Apache Commons IO</a> | commons-io : commons-io | 2.7 |
| <a href="http://www.slf4j.org/" target="_blank">Slf4J</a> | org.slf4j : slf4j-api | 1.7.30 |
| <a href="http://logback.qos.ch/" target="_blank">Logback</a> | ch.qos.logback : logback-classic | 1.2.3 |
| <a href="https://github.com/FasterXML/jackson" target="_blank">FasterXML Jackson</a> | com.fasterxml.jackson.core : jackson-databind | 2.11.1 |
| <a href="https://junit.org/junit5/" target="_blank">Junit 5</a> | org.junit.jupiter : junit-jupiter</br>org.junit.vintage : junit-vintage-engine | 5.6.2 |
| <a href="https://assertj.github.io/doc/" target="_blank">AssertJ</a> | org.assertj : assertj-core | 3.16.1 |
| <a href="https://maven.apache.org/plugins/maven-compiler-plugin/" target="_blank">Maven Compiler Plugin</a> | org.apache.maven.plugins : maven-compiler-plugin | 3.8.1 |
| <a href="https://maven.apache.org/surefire/maven-surefire-plugin/" target="_blank">Maven Surefire Plugin</a> | org.apache.maven.plugins : maven-surefire-plugin | 2.22.2 |
| <a href="https://www.mojohaus.org/versions-maven-plugin/" target="_blank">Versions Maven Plugin</a> | org.codehaus.mojo : versions-maven-plugin | 2.8.1 |

### Custom Properties
| Name | Mandatory | Description | Default Value
|-|-|-|-|
| author | N | Author's name used in README.md of the project generated from archetype | Victor&nbsp;Nedioglo&nbsp;(@VixOrg)
| javaVersion | N | Java version used by the maven compiler plugin | 14 |
| sourceEncoding | N | Source files encoding | UTF-8 |