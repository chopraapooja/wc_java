import static org.junit.Assert.*;
import org.junit.Test;

public class WCTest {
	@Test
	public void wordCount_of_HELLO_WORLD_should_be_2() {
		WC wc = new WC("HELLO WORLD");
		assertEquals(wc.getWordCount(), 2);
	}
	@Test
	public void wordCount_of_EMPTY_STRING_should_be_0() {
		WC wc = new WC("");
		assertEquals(wc.getWordCount(), 0);
	}
	@Test
	public void wordCount_of_text_with_several_whiteSpaces() {
		WC wc = new WC("Kidney    Kaustav\nTalent\tShow\r\n Kaust ");
		assertEquals(wc.getWordCount(), 5);
	}
	@Test
	public void charCount_of_HELLO_WORLD_should_be_10() {
		WC wc = new WC("HELLO WORLD");
		assertEquals(wc.getCharCount(), 11);	
	}
	@Test
	public void charCount_of_EMPTY_STRING_should_be_0() {
		WC wc = new WC("");
		assertEquals(wc.getCharCount(), 0);	
	}

	@Test
	public void charCount_testing_with_few_lines_of_text() {
		WC wc = new WC("hello, How are you?\nI am fine\nAnd you?\n");
		assertEquals(wc.getCharCount(), 39);	
	}

	@Test
	public void lineCount_of_HELLO_WORLD_should_be_1() {
		WC wc = new WC("HELLO WORLD");
		assertEquals(wc.getLineCount(), 1);	
	}
	@Test
	public void lineCount_of_EMPTY_STRING_should_be_0() {
		WC wc = new WC("");
		assertEquals(wc.getLineCount(), 0);	
	}
	@Test
	public void create_should_create_WC_object() {
		try{
			String expected = "one two three four five".replace(" ", "\r\n")+"\r\n";
			WC wc = WC.create("./test_data/counting");
			assertTrue(expected.equals(wc.getText()));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@Test(expected = java.io.FileNotFoundException.class)
	public void create_should_throw_exception_ojn_providing_WRONG_file_name() throws Exception {
			WC wc = WC.create("bad.txt");
	}
	
}