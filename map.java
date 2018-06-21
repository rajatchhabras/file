package file;
import java.util.*;
public class map {

	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1,"rajat");
		mp.put(2,"chhabra");
		mp.put(3,"is");
		mp.put(4,"very");
		mp.put(5,"smart");
		for(Map.Entry x:mp.entrySet()){  
			   System.out.println(x.getKey()+" "+x.getValue());  
	}

}
}
