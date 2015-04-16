import java.util.Random;


public class SortDriver {
	static Integer number;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println(randomArray[2]);
		Window w = new Window();
		number = w.getNumber();
		ArrayGen a = new ArrayGen(number);
		
		
		InsertionSort insertThread= new InsertionSort(a.getInsertionArray());
		MergeSort mergeThread = new MergeSort(a.getMergeArray());
		RadixSort radixThread=new RadixSort();
		BubbleSort bubbleThread= new BubbleSort(a.getBubbleArray());
		QuickSort quickThread = new QuickSort(a.getQuickArray());
		
		
		
		//insertThread.run();
	   // mergeThread.run();
	    //radixThread.run();
	   // quickThread.run();
	   // bubbleThread.run();
		
		
		System.out.println("How many random numbers?: "+number);
		System.out.println("How big is array?:"+ a.randomArrayLength());

	
		
		

}
}