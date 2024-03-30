package eugenekru.javacourse.hometask09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithText {
	
	private String textFilePath;
	
	private StringBuffer text;

	public WorkingWithText(String textFilePath) {
		super();
		this.textFilePath = textFilePath;		
		this.text = new StringBuffer();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(this.textFilePath))) {			
			String line;
			
			while((line = reader.readLine()) != null) {
				text.append(line + "\n");
			}
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	private int countMatchByPattern(TextPattern model) {
		
		int count = 0;				
		Pattern pattern = Pattern.compile(model.getPattern());
		Matcher matcher = pattern.matcher(this.text);
		
		while (matcher.find()) {
			count++;
		}
		return count;		
	}
	
	public void printFileMatches(TextPattern...model) {		
		System.out.println("\nMatches in textfile (" + textFilePath + ").");
		
		for(TextPattern element: model) {
			System.out.println("Number of " + element.name().toLowerCase()
								+ "s: "	+ countMatchByPattern(element));
		}
	}
	
	private static StringBuffer getLineFromFile(String textFilePath) {
		
		StringBuffer text = new StringBuffer();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(textFilePath))) {
			
			String line;
			
			while((line = reader.readLine()) != null) {
				text.append(line + "\n");
			}
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return text;
	}
	
	private static int countMatchByPattern(String textFilePath, TextPattern model) {
		
		int count = 0;				
		Pattern pattern = Pattern.compile(model.getPattern());
		Matcher matcher = pattern.matcher(getLineFromFile(textFilePath));
		
		while (matcher.find()) {
			count++;
		}
		return count;		
	}
	
	public static void printFilesMatch(TextPattern model, String...textFilePath) {
		System.out.println("\nNumber of " + model.name().toLowerCase() + "s:");
		
		for(String file: textFilePath) {
			System.out.println("in textfile (" + file + "): "
								+ countMatchByPattern(file, model));
		}
	}

}
