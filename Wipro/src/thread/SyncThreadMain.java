package thread;



public class SyncThreadMain {

		public static void main(String[] args)
		{
			// Object of Line class that is shared among the threads.
			SycronizedThread obj = new SycronizedThread();

			new Thread(){                 
				  public void run()
				  {
					obj.factorial(6);;
				  }  
			}.start();
				
			new Thread(){                 
				public void run()
				{
					obj.add(20,10);
				}  
			}.start();
			
			new Thread(){                 
				  public void run()
				  {
					obj.factorial(4);;
				  }  
			}.start();
			
			new Thread(){                 
				public void run()
				{
					obj.add(4,5);
				}  
			}.start();
		}
}
	
