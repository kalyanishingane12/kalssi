
public class TestThread2 
{

	public static void main(String[] args)
	{
		System.out.println("hello");
		MyThread t1= new MyThread(null);
		t1.start();
		System.out.println("Hello1");
	}
}
