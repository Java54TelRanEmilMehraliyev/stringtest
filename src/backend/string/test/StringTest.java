package backend.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("Test of the method concat")
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World", hello.concat(" World"));
	}
	@Test
	@DisplayName("Test of the method contain, boolean")
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("lll"));
	}
	@Test
	@DisplayName("Test of the compareTo,")
	void compareToTest() {
		String hero = "Alladin";
		String nick = "Jedi";
	    int result = nick.compareTo(hero);
	    System.out.println("result of campareTo: " + result);
	    }
	@Test
	@DisplayName("Test of compareToIgnoreCase")
	void compareToIgnoreCaseTest() {
		String hero = "Alladin";
		String nick = "Moses";
		int result = nick.compareToIgnoreCase(hero);
		System.out.println("result of compareToIgnoreCase: " + result);
	}
	@Test
	@DisplayName("Test of startsWith, boolean")
	void startsWithTest() {
		String hero = "Alladin";
		assertTrue(hero.startsWith("A"));
	}
	@Test
	@DisplayName("Test of endWith, boolean")
	void endsWithTest() {
		String str1 = "Hi Wolrd i love you!";
		assertTrue(str1.endsWith("!"));
		assertFalse(str1.endsWith(" "));
	}
	@Test
	@DisplayName("Test of equalsIgnoreCase,boolean")
	void equalsIgnoreCase() {
		String str1 = "Alladin";
		String str2 = "JERUSALEM";
		String str3 = "jerusalem";
		assertFalse(str1.equalsIgnoreCase(str2));
		assertTrue(str2.equalsIgnoreCase(str3));
	}
	@Test
	@DisplayName("Test of indexOf(string)")
	void indexOf() {
		String str1 = "Hello World";
		int index = str1.indexOf("World");
		System.out.println(index);
	}
	@Test
	@DisplayName("Test of the method lastIndexOf(int ch)")
	void lastIndexOf() {
		String str1 = "Hello World, i love you so much";
		int index = str1.lastIndexOf("much");
		assertEquals(27, index);
	}
}