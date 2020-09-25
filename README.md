## [VixOrg Archetypes Bundle](https://github.com/VixOrg/vixorg-archetypes)
This repository contains a set of [Maven Archetypes](https://maven.apache.org/archetype/index.html) for creating a java maven project with predefined folder structure and sample files.

### Archetypes
1. [vixorg-archetype-quickstart](https://github.com/VixOrg/vixorg-archetypes/tree/master/vixorg-archetype-quickstart)

### Installation
The VixOrg Archetypes Bundle must be installed into an archetype catalog so that you can use them.
Here are the steps for installing them to your local maven archetype catalog using command line:
- Verify you have Maven installed by using `$ mvn -version`. (If it is installed, the version will be printed, otherwise follow the [instructions to download and install it](https://maven.apache.org/install.html))
- Go to the directory where you want to checkout the archetypes bundle project `$ cd /some/path`
- Clone the GitHub repository `$ git clone https://github.com/VixOrg/vixorg-archetypes.git`
- Go into to the project root directory `$ cd vixorg-archetypes`
- Compile and install the archetypes to your local archetype catalog `$ mvn clean install`
- Verify the installation `$ cat ~/.m2/repository/archetype-catalog.xml | grep vixorg` This should print the groupId and atrtifactId of all archeotypes available in your local catalog

### Usage
Follow these steps for creating a java maven project from a custom archetype:
- Go to the directory where you want the new project to be created `$ cd /some/path`
- Generate the project by executing

> $ **mvn archetype:generate** **-DarchetypeCatalog**=local **-DinteractiveMode**=false **-DarchetypeGroupId**=vixorg.archetypes **-DarchetypeArtifactId**=vixorg-archetype-quickstart **-DarchetypeVersion**=1.0.0 **-DgroupId**=vixorg **-DartifactId**=sample-project **-Dversion**=1.0.0 **-Dpackage**=vixorg.playground **-DjavaVersion**=14

- Go into the generated project folder and verify the contents `$ cd sample-project`
- Compile the newly generated project `$ mvn clean verify`
- Import the maven project to your IDE

### Happy coding!
