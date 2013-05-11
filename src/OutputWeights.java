import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OutputWeights {

	/**
	 * @param args
	 */
	public ArrayList<ArrayList<String>> getFeatureWeights(String file_name) {
	
		 ArrayList<ArrayList<String>> weights = new ArrayList<ArrayList<String>>();		
		
		  try{
		  // Open the file that is the first 
		  // command line parameter
		  FileInputStream fstream = new FileInputStream(file_name);
		  // Get the object of DataInputStream
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  //Read File Line By Line
		  while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
			  ArrayList<String> curWeight = new ArrayList<String>(); 
			  String curString ="";			  

			  strLine = strLine.substring(6);	
			  
			  curString = strLine.substring(0,strLine.indexOf(' '));		  
			 
			  
			  strLine=strLine.substring(strLine.indexOf(' ')+1);
			  strLine=strLine.substring(strLine.indexOf(' ')+1);
			  String curPhi = strLine.substring(0,strLine.indexOf(':'));
			  strLine=strLine.substring(strLine.indexOf(':')+2);
			
			  curWeight.add(curPhi);
			  curWeight.add(curString);
			  curWeight.add(strLine);
			  weights.add(curWeight);			  
		  }
		  //Close the input stream
		  
		  in.close();
		    }catch (Exception e){//Catch exception if any
		  
		    	System.err.println("Error: " + e.getMessage());
		    }
		  
		  return weights;
	
		}
	}
