public class TextFile {
	String text;
	
	TextFile(String text) {
		this.text = text;
	}

	int getWordCount() {
		if(text.equals("")) return 0;
		return text.split("\\s+").length;
	}

	int getCharCount() {
		if(text.equals("")) return 0;
		return text.split("").length;
	}

	int getLineCount() {
		if(text.equals("")) return 0;
		return text.split("\n").length;
	}
}