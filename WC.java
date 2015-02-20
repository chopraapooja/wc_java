import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class WC {
	private String text;
	private WCSummary summary;
	
	WC(String text) {
		this.text = text;
	}

	WC(String text, String fileName) {
		this.text = text;
		summary = new WCSummary(getWordCount(), getCharCount(), getLineCount(), fileName);
	}

	String getText() {
		return text;
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



	public static WC create(String path) throws Exception{
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		int length = (int)file.length();
		char contants[] = new char[length];
		br.read(contants,0,length);
		return new WC(new String(contants));
	}
	
	public static void main(String[] args) {
		String file = args[0];
		try {
			WC wc = create(file);
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Invalid File");
		}
	}
}