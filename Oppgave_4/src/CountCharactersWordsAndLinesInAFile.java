import java.io.FileNotFoundException;
import java.util.*;

public class CountCharactersWordsAndLinesInAFile {

    public static void main(String[] args) {

        java.io.File file = new java.io.File("mysql.txt");

        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            return;
        }

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();

            String[] words = line.split("\\s");

            for (String word : words) {
                characterCount += word.length();
            }
            wordCount += words.length;
            lineCount++;
        }
        System.out.println("File name: " + file.getName()+ "\nFile size: " + file.length() + " bytes");
        System.out.println("Characters: " + characterCount + "\nWords: " + wordCount + "\nLines: " + lineCount);


    }

    }
