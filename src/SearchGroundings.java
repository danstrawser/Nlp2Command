import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SearchGroundings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		 ArrayList<ArrayList<String>> weights = new ArrayList<ArrayList<String>>();		
		
		  try{
		  // Open the file that is the first 
		  // command line parameter
		  FileInputStream fstream = new FileInputStream("weights.txt");
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
			  
			  /*System.out.println(curPhi);
			  System.out.println (curString);			  
			  System.out.println(strLine);*/
			  
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
		  
	
		  //For sentence "Fly to Houston"				
		  Iterator itr = weights.iterator();
		  String city = "Houston";
		  String prep = "to";
		  int index_city=-1;
		  int index_prep=-1;
		  String phiCity="";
		  String phiPrep="";
		  		  
		  while(itr.hasNext()){
			  ArrayList<String> curItr = (ArrayList<String>) itr.next();		  
			  if(curItr.get(1).equals(city) && curItr.get(0).substring(0,1).equals("t")){
				  phiCity=curItr.get(0);
			  }
			  if(curItr.get(1).equals(prep) && curItr.get(0).substring(0,1).equals("t")){
				  phiPrep=curItr.get(0);
			  }
			  //System.out.println(curItr);
			  //System.out.println(itr.next());		   
		  }
		  
		  System.out.println("phiPrep is "+phiPrep);
		  System.out.println("Phi city is "+phiCity);
		}
	}
