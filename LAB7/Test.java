import java.io.FileInputStream;
import java.io.*;
import java.util.*;
public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/salsa/Google Drive/spring20-21/cmse211/java/LAB7/testfile.TXT");
		Scanner readfile = new Scanner(file);
		int characterCount=0;
		int wordCount=0;
		int lineCount=0;
		while(readfile.hasNextLine()) {
			lineCount++;
			String line=readfile.nextLine();
			characterCount+=charwithoutSpaces(line);
			String[]wordList=line.split("\\S+");
			wordCount+=wordList.length;
		}
		System.out.println("The number of lines="+ lineCount);
		System.out.println("The number of words="+wordCount);
		System.out.println("The number of Characters without spaces = "+characterCount);
		
	}
    public static int charwithoutSpaces( String line) {
        int spacecount=0;
        for (int i =0; i< line.length(); i++){
            if (line.charAt(i)== ' ')
               spacecount++;
        }
        return (line.length() - spacecount);
    }
	
}
