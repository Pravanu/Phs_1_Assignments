package thread;

public class WaitMain {

	public static void main(String args[]){  
		final Wait w=new Wait();  
		
		new Thread(){                 
		  public void run()
		  {
			w.withdraw(5000);
		  }  
		}.start();  
		
		new Thread(){  
		  public void run()
		   {
			 w.deposit(4000);
		   }  
		}.start(); 
		
		new Thread(){                 
			public void run()
			  {
				w.withdraw(10000);
			  }  
			}.start();
		
		new Thread(){                 
			public void run()
			{
				w.withdraw(20000);
			}  
			}.start();
		
	}
	
}
class Wait{
	int amount=10000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
		if(this.amount<amount)
		{  
		System.out.println("Less balance; waiting for deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		
		System.out.println("deposit completed... " + this.amount);  
		notify();  
	}  
}
