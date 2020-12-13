import java.io.IOException;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) throws IOException  {
		readFile_WriteConsole_Capital("CheckFile.txt");
	}
	
	public static void readFile_WriteConsole(String path) throws IOException {
		MyFileReader fr = new MyFileReader();
		List<String> characters = fr.readFile(path);
		for (String s : characters) {
			System.out.println(s);
		}
	}
	public static void readFile_WriteConsole_Capital(String path) throws IOException {
		MyFileReader fr = new MyFileReader();
		List<String> capitalCharacters = fr.readFileInCapital(path);
		for (String s : capitalCharacters) {
			System.out.println(s);
		}
	}
}

