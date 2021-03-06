## Archetype [vixorg-archetype-quickstart](https://github.com/VixOrg/vixorg-archetypes/tree/master/vixorg-archetype-quickstart)
This archetype is great for generating simple java maven projects with most commonly used dependencies.
The generated project will contain an example application class (with `public static Main(String... args)` method) and an example [JUnit 5](https://junit.org/junit5/) test case. It will also have the logging configured (using [logback](http://logback.qos.ch/) and [slf4j](http://www.slf4j.org/)) and a sample code for reading and initializing the `application.properties`.

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
| [Java](https://jdk.java.net/14/) | OpenJDK | 14+ |
| [Lombok](https://projectlombok.org/) | org.projectlombok : lombok | 1.18.16 |
| [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) | org.apache.commons : commons-lang3 | 3.11 |
| [Apache Commons Math](https://commons.apache.org/proper/commons-math/) | org.apache.commons : commons-math3 | 3.2 |
| [Apache Commons IO](http://commons.apache.org/proper/commons-io/) | commons-io : commons-io | 2.7 |
| [Slf4J](http://www.slf4j.org/) | org.slf4j : slf4j-api | 2.0.0-alpha1 |
| [Logback](http://logback.qos.ch/) | ch.qos.logback : logback-classic | 1.3.0-alpha5 |
| [FasterXML Jackson](https://github.com/FasterXML/jackson) | com.fasterxml.jackson.core : jackson-databind | 2.12.0-rc2 |
| [Junit 5](https://junit.org/junit5/) | org.junit.jupiter : junit-jupiter</br>org.junit.vintage : junit-vintage-engine | 5.6.2 |
| [AssertJ](https://assertj.github.io/doc/) | org.assertj : assertj-core | 3.18.1 |
| [Maven Compiler Plugin](https://maven.apache.org/plugins/maven-compiler-plugin/) | org.apache.maven.plugins : maven-compiler-plugin | 3.8.1 |
| [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/) | org.apache.maven.plugins : maven-surefire-plugin | 3.0.0-M5 |
| [Maven Enforcer Plugin](https://maven.apache.org/enforcer/maven-enforcer-plugin/) | org.apache.maven.plugins : maven-enforcer-plugin | 3.0.0-M3 |
| [Versions Maven Plugin](https://www.mojohaus.org/versions-maven-plugin/) | org.codehaus.mojo : versions-maven-plugin | 2.8.1 |

### Custom Properties
| Name | Mandatory | Description | Default Value
|-|-|-|-|
| author | N | Author's name used in README.md of the project generated from archetype | Victor&nbsp;Nedioglo&nbsp;(@VixOrg)
| javaVersion | N | Java version used by the maven compiler plugin | 14 |
| sourceEncoding | N | Source files encoding | UTF-8 |
| dotGitIgnoreFile | N | .gitignore file name (used for the workaround for the issue of .gitignore not being copied in target project) | .gitignore |

### Additional Notes
Comment out `<scope>test</scope>` in JUnit and AssertJ dependencies in the pom.xml for being able to have the code and the unitTest in the same class file (useful when doing small exercises or prototyping).