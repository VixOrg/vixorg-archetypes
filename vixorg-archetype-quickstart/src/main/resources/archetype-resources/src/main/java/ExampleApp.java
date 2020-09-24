#set( $getPropertyMethod = $package.getClass().forName("java.lang.System").getMethod("getProperty", $package.getClass()) )
#set( $archetypeGroupId = $getPropertyMethod.invoke(null, "archetypeGroupId") )
#set( $archetypeArtifactId = $getPropertyMethod.invoke(null, "archetypeArtifactId") )
#set( $archetypeVersion = $getPropertyMethod.invoke(null, "archetypeVersion") )
package ${package};

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleApp {

	private Properties props;

	public ExampleApp() {
		this.props = loadProperties("application.properties");
	}

	public static void main(String... args) {
		var app = new ExampleApp();
		app.printInfo();
	}

	public void printInfo() {
		log.info("Sample method generated by maven archetype ${archetypeArtifactId} v${archetypeVersion}");
		log.info("It is as {} as 2 + 2 = {}", props.getProperty("complexity.level", "easy"), getSum(2, 2));
	}

	protected int getSum(int a, int b) {
		return a + b;
	}

	private Properties loadProperties(String fileName) {
		var properties = new Properties();
		try (var inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
			if (inStream == null) {
				log.warn("resources/application.properties is missing. Skip loading properties.");
			} else {
				properties.load(inStream);
				log.debug("Loaded properties: {}", properties);
			}
		} catch (IOException ex) {
			log.warn("Failed to load propertioes from application.properties");
			log.debug("Exception occurred", ex);
		}
		return properties;
	}
}