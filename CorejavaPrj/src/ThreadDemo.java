public class ThreadDemo extends Thread{
	public void run()
	{
        System.out.println("Running Thread Name: "+ this.currentThread().getName());
        System.out.println("Running Thread Priority: "+ this.currentThread().getPriority());

	}



	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		t1.setName("First Thread");
		t1.setPriority(Thread.MIN_PRIORITY);//1
		ThreadDemo t2=new ThreadDemo();
		t2.setName("Second Thread");
		t2.setPriority(Thread.MAX_PRIORITY);//10
		ThreadDemo t3=new ThreadDemo();
		t3.setName("Thrid Thread");
		t3.setPriority(Thread.NORM_PRIORITY);//5
		ThreadDemo t4=new ThreadDemo();
		t4.setName("four Thread");
		t4.setPriority(3);//3
        t1.start();
        t2.start();
        t3.start();
        t4.start();


	}

}
