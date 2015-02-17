import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextFileTest {
	@Test
	public void wordCount_of_HELLO_WORLD_should_be_2() {
		TextFile file = new TextFile("HELLO WORLD");
		assertEquals(file.getWordCount(), 2);
	}
	@Test
	public void wordCount_of_EMPTY_STRING_should_be_0() {
		TextFile file = new TextFile("");
		assertEquals(file.getWordCount(), 0);
	}
	@Test
	public void wordCount_of_text_with_several_whiteSpaces() {
		TextFile file = new TextFile("Kidney    Kaustav\nTalent\tShow\r\n Kaust ");
		assertEquals(file.getWordCount(), 5);
	}
	@Test
	public void charCount_of_HELLO_WORLD_should_be_10() {
		TextFile file = new TextFile("HELLO WORLD");
		assertEquals(file.getCharCount(), 11);	
	}
	@Test
	public void charCount_of_EMPTY_STRING_should_be_0() {
		TextFile file = new TextFile("");
		assertEquals(file.getCharCount(), 0);	
	}
	@Test
	public void lineCount_of_HELLO_WORLD_should_be_1() {
		TextFile file = new TextFile("HELLO WORLD");
		assertEquals(file.getLineCount(), 1);	
	}
	@Test
	public void lineCount_of_EMPTY_STRING_should_be_0() {
		TextFile file = new TextFile("");
		assertEquals(file.getLineCount(), 0);	
	}
}