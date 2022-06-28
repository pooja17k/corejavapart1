
public class ExceptionEx {

	public static void main(String[] args) {
		
		try{
            int a[] = new int[3];
            a[5] = 9; 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
		/* try {
	          /*  int a = 15, b = 0;
	            int c = a/b;  
	            System.out.println ("Result = " + c);
			 String s=null;
			 System.out.println ("Length"+s.length());
		 }
		 catch(NullPointerException e) {
		 System.out.println ("Null Exception===>"+e);
		 }*/
		  /*catch(ArithmeticException e) {
         System.out.println ("Can't divide a number by 0");
     }*/
		 finally {
			 System.out.println("Fianlly blockS");
		 }
		 
		 
	       /* catch(ArithmeticException e) {
	            System.out.println ("Can't divide a number by 0");
	        }*/

	}

}
