interface A 
{ 
 void msg(); 
 
} 
interface B 
{ 
	void msg(); 
 } 
class C implements A, B 
{ 
	@Override
	public void msg()
	{
	System.out.println("msg() method implementation");
	}

 public static void main(String args[]) 
 { 
	
   C obj = new C(); 
   obj.msg();//Now which msg() method would be called? 
  } 
 }
