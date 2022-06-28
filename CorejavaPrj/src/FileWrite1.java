import java.io.*;

class FileWrite1{
		public static void main(String args[]){
			try{
				FileWriter fw=new FileWriter("E://abc.txt");
				fw.write("hi i am developed file prog....*****");
				fw.close();
			}
				catch(Exception e){System.out.println(e);}
			System.out.println("Data inserted");
				}
		
	}


