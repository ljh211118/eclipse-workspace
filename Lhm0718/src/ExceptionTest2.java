import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("list.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 존재하지 않아요!!");
		
		} catch (IOException e) {
		
		}
		
	}

}