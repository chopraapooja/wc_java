class WCSummary {
	private int words;
	private int bytes;
	private int lines;
	private String fileName;

	WCSummary(int words, int bytes, int lines, String fileName) {
		this.words = words;
		this.bytes = bytes;
		this.lines = lines;
		this.fileName = fileName;
	}
}