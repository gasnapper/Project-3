
public class InsertionSort implements Runnable {

	Thread t;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("The thread is running");
	}

	
	public void begin(){
		
		System.out.println("Starting");
		
		if (t==null){
			
			t = new Thread(this);
			t.start();
		
		}
	}
}
