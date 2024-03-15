package eugenekru.javacourse.hometask09;

public enum TextPattern {
	
	COMMA(","),
	
	WORD("[^\\d\\s]+"),	
	
	DOT("\\."),
	
	PUNCTUATION_MARK("[,\\.!?)(;:-]");	

	final private String pattern;
	
	private TextPattern(String pattern) {		
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	
	
}
