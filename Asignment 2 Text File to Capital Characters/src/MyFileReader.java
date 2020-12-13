import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {

	public List<String> readFile(String path) throws IOException {
        	//Line-Oriented I/O
			BufferedReader inputStream = null;
			List<String> characters = new ArrayList<String>();
	        try {
	            inputStream = new BufferedReader(new FileReader(path));

	            String l;
	            while ((l = inputStream.readLine()) != null) {
	            	characters.add(l);
	            }
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	        }
			return characters;
      
	}
	
	public List<String> readFileInCapital(String path) throws IOException {
		//Line-Oriented I/O
		BufferedReader inputStream = null;
		List<String> characters = new ArrayList<String>();
        try {
            inputStream = new BufferedReader(new FileReader(path));

            String l;
            while ((l = inputStream.readLine()) != null) {
            	characters.add(l.toUpperCase());
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
		return characters;	
	}
}
