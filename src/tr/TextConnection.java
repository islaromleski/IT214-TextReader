/**
 * @author	Matthew Romleski
 * 			Matt Fuller
 * 			Rajeev Nukala
 * 			Thomas Klapperich
 */

package tr;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextConnection {

	private List<String> fileText = new ArrayList<String>();
	
	public List<String> getFile(String aPath, String aFile){
		try {
			fileText = Files.readAllLines(
			Paths.get(aPath, aFile),
			Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fileText;
	}
	
}
