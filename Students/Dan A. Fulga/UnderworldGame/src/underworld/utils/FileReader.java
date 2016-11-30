package underworld.utils;

import java.io.File;
import java.util.Scanner;

public class FileReader {
	
	public static void printFileContents(String pathToFile){
		
		try{
			File fileName = new File( pathToFile );
			Scanner scanner = new Scanner ( fileName );
			while (scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		catch(Exception error){
			System.out.println("Cannot open the file ");
		}
	}
}