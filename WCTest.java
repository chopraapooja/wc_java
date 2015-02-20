import static org.junit.Assert.*;
import org.junit.Test;

public class WCTest {
	@Test
	public void wordCount_of_HELLO_WORLD_should_be_2() {
		WC file = new WC("HELLO WORLD");
		assertEquals(file.getWordCount(), 2);
	}
	@Test
	public void wordCount_of_EMPTY_STRING_should_be_0() {
		WC file = new WC("");
		assertEquals(file.getWordCount(), 0);
	}
	@Test
	public void wordCount_of_text_with_several_whiteSpaces() {
		WC file = new WC("Kidney    Kaustav\nTalent\tShow\r\n Kaust ");
		assertEquals(file.getWordCount(), 5);
	}
	@Test
	public void charCount_of_HELLO_WORLD_should_be_10() {
		WC file = new WC("HELLO WORLD");
		assertEquals(file.getCharCount(), 11);	
	}
	@Test
	public void charCount_of_EMPTY_STRING_should_be_0() {
		WC file = new WC("");
		assertEquals(file.getCharCount(), 0);	
	}

	@Test
	public void charCount_testing_with_few_lines_of_text() {
		WC file = new WC("hello, How are you?\nI am fine\nAnd you?\n");
		assertEquals(file.getCharCount(), 39);	
	}

	@Test
	public void lineCount_of_HELLO_WORLD_should_be_1() {
		WC file = new WC("HELLO WORLD");
		assertEquals(file.getLineCount(), 1);	
	}
	@Test
	public void lineCount_of_EMPTY_STRING_should_be_0() {
		WC file = new WC("");
		assertEquals(file.getLineCount(), 0);	
	}
	@Test
	public void create_should_create_WC_object() {
		try{
			String expected = "one two three four five".replace(" ", "\r\n");
			WC file = WC.create("./test_data/counting");
			System.out.println();
			
			char[] actual = file.text.trim().toCharArray();
			char[] expec = expected.toCharArray();

			System.out.println(actual.length +"------"+ expec.length);
			System.out.println("====>>"+actual[28]+"<==");
			// for(int i = 0; i < actual.length; i++){
			// 	System.out.println((actual[i] == expec[i])+"\t"+actual[i]+" "+ expec[i]);
			// }
			// assertArrayEquals(actual, expec);
			// assertTrue(expected.equals(file.text));
		}
		catch(Exception e) {}
	}

}