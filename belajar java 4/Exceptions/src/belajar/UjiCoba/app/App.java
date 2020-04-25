package app;
import java.util.*;
import java.io.*;

public class App {
	public static void main(String[] args) {
		try{

			FileReader fileInput = new FileReader("data.txt");
			BufferedReader bufferedReader = new BufferedReader(fileInput);

			Scanner scanner = new Scanner(bufferedReader);

			// this is for check there next word or not
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}catch(FileNotFoundException ex){
			System.out.println(ex);
		}finally{
			System.out.println("success");
		}
	}
}