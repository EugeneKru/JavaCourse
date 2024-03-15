package eugenekru.javacourse.hometask09;

public class Main {

	public static void main(String[] args) {
		
		final String FILE_PATH_1 = "resources/hometask09/latin_text.txt";		
		final String FILE_PATH_2 = "resources/hometask09/Philip_Farmer_Dayworld.txt";		
		final String FILE_PATH_3 = "resources/hometask09/Philip_K.Dick_Man_In_The_Castle.TXT";
		
		WorkingWithText.printFilesMatch(TextPattern.PUNCTUATION_MARK,
				FILE_PATH_1,
				FILE_PATH_2,
				FILE_PATH_3);		
		
		
		WorkingWithText latinText = new WorkingWithText(FILE_PATH_1);
		
		latinText.printFileMatches(TextPattern.WORD,
				TextPattern.COMMA,
				TextPattern.DOT,
				TextPattern.PUNCTUATION_MARK);
		
	}

}
