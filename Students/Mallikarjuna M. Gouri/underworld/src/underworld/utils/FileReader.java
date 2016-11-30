package underworld.utils;
import java.util.Scanner;
import java.io.File;

public class FileReader {
	public static void printFileContents(String pathToFile){
		try{
			File file = new File(pathToFile);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		catch(Exception error){
			System.out.println("File couldn't be opened");
		}
	}

}
