
public class MyThread extends Thread
{
String str1;
	
	public MyThread(String str1) 
	
		{
			this.str1=str1;
			
		}
		public void run()//running
		{
			System.out.println("Welcome:"+str1);
			
		}
}


