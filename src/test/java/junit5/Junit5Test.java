package junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class Junit5Test {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("test info")
	public void testInfo(final TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}

	@Test
	@DisplayName("test reporter")
	public void testReporter(final TestReporter testReporter) {
		testReporter.publishEntry("name", "Alex");
	}

//	@TestFactory
//	public Collection<DynamicTest> simpleDynamicTest() {
//		return Collections.singleton(dynamicTest("simple dynamic test", () -> assertTrue(2 > 1)));
//	}
//
//	@TestFactory
//	public Stream<DynamicTest> streamDynamicTest() {
//		return stream(Stream.of("Hello", "World").iterator(), (word) -> String.format("Test - %s", word), (word) -> assertTrue(word.length() > 4));
//	}

}
