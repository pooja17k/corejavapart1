import java.util.Scanner;
class Namelength extends Exception{
	@Override
	public String toString() {
		return "you have not enter either first or seconed name";
	}
}
public class checkExp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Please enter the first name");
        String first_name=sc.next();
        System.out.println("Please enter the last name");
        String last_name=sc.next();
        try {
       	 if(first_name.equals("pooja") || (last_name.equals("N"))) {
       		 throw new Namelength();
       	 }
       	 else 
       		 System.out.println(first_name+" "+last_name);
        }
        catch(Exception e) {
		System.out.println("**" + e.toString());
        }
	}

}
