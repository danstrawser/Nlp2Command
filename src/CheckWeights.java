import java.util.ArrayList;
import java.util.Iterator;


public class CheckWeights {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<ArrayList<String>> weights = new OutputWeights().getFeatureWeights("weights.txt");
		
		 Iterator<ArrayList<String>> it = weights.iterator();
		 while(it.hasNext())
		 {
		    System.out.println("This is the next line " +it.next());
		     
		 }
		 

	}

}
