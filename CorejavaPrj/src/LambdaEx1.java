import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

interface Addable {
	int add(int a, int b);// abstract method
}

public class LambdaEx1 {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		/*
		 * Addable ad1=(a,b)->(a+b); System.out.println("Addition:"+ad1.add(10,20));
		 * 
		 * // Multiple parameters with data type in lambda expression Addable ad2=(int
		 * a,int b)->(a+b); System.out.println(ad2.add(100,200));
		 */
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");
		System.out.println("Elemet"+list);
		list.forEach(
				// lambda expression
		(names) -> System.out.println(names));
		TreeSet<Integer> h = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		h.add(850);
		h.add(235);
		h.add(1080);
		h.add(15);
		h.add(5);
		System.out.println("Elements of the TreeSet after" + " sorting are: " + h);
	}
}
