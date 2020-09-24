package ${package};

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExampleAppTest {

	protected static ExampleApp app;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		app = new ExampleApp();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Should check java version to be 10+")
	@Test
	void shouldCheckJavaVersion() {
		String javaVersion = System.getProperty("java.version", "9.0.0");
		assertNotNull(javaVersion);
		assertTrue(javaVersion.length() > 0);
		String[] javaVersionsArray = StringUtils.split(javaVersion, ".");
		assertTrue(javaVersionsArray.length > 0);
		String javaMajorVersion = javaVersionsArray[0];
		assertNotNull(javaMajorVersion);
		assertTrue(javaMajorVersion.length() > 0);
		assertTrue(Long.parseLong(javaMajorVersion) >= 10L);
	}

	@DisplayName("Should return the sum of two numbers")
	@ParameterizedTest(name = "{index} ==> ({0}) + ({1}) = {2}")
	@MethodSource("${package}.ExampleAppTest#summingTestArguments")
	public void shouldGetSum(int a, int b, int c) {
		assertEquals(c, app.getSum(a, b));
	}

	public static Stream<Arguments> summingTestArguments() {
		return Stream.of(
			Arguments.of( 2, -2,  0),
			Arguments.of(-2, -2, -4),
			Arguments.of( 2,  3,  5));
	}
}
