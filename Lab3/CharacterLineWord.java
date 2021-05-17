import java.util.*;
import java.io.*;

public class CharacterLineWord {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\joysu\\eclipse-workspace\\CapGLab_Module1\\src\\countCLW.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int wordCount = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        while((line = reader.readLine()) != null) {
        	characterCount += line.length();
            String[] wordList = line.split("\\s+");      
            wordCount += wordList.length;
            String[] sentenceList = line.split("[!?.:]+");      
            sentenceCount += sentenceList.length;
        }
        System.out.println("Total word count = " + wordCount);
        System.out.println("Total number of lines = " + (sentenceCount-1));
        System.out.println("Total number of characters = " + characterCount);
        
        reader.close();
	}

}
