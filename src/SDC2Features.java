import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class SDC2Features {
	
	
	public static void main(String[] args) {
		try {
 
			
			
			
			
			String content = "LABEL\tFEATURE1\tFEATURE2\r\nLABEL\tFEATURE1\tFEATURE2\r\n";
 
			
			
			
			File file = new File("features.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}