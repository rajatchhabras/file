package file;
import java.util.*;
public class hash {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("one");
		h.add("green");
		h.add("pink");
		h.add("rajat");
		h.add("handsome");
		HashSet<String> h1=new HashSet<String>();
		h1.add("two");
		h1.add("gray");
		h1.add("blue");
		h1.add("rajat");
		h1.add("handsome");
		h.retainAll(h1);
		System.out.println("SIMILAR ELEMENTS IN BOTH OF THEM ARE ");
		Iterator it=h.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
