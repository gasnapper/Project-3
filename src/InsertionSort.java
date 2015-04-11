
public class InsertionSort implements Runnable {

	Thread t;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	int i ,j ;
	int key = 0;
	int[] data= {0,55,42,2,8,18,98,722};
for( i=1;i< data.length;i++){
		
		System.out.print(data[i]);
}
	
	for( i=1;i< data.length;i++){
		
		
		key=data[i];
		j=i;
		while(j >0 && data[j-1]>key){
			
			data[j]=data[j-1];
			j--;
		}
		
		data[j]=key;
	}
	for(i=0;i<data.length;i++)
	System.out.print("After Sorting" +data[i] + ",");
	}

	
	public void begin(){
		
		System.out.println("Starting");
		
		if (t==null){
			
			t = new Thread(this);
			t.start();
		
		}
	}
}
