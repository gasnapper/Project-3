import java.util.Arrays;
import java.util.Random;


public class SortDriver {
	static Integer number;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Window w = new Window();
		number = w.getNumber();
		ArrayGen a = new ArrayGen(number);
		
		
		InsertionSort insertThread= new InsertionSort(a.getInsertionArray());
		MergeSort mergeThread = new MergeSort(a.getMergeArray());
		RadixSort radixThread=new RadixSort();
		BubbleSort bubbleThread= new BubbleSort(a.getBubbleArray());
		QuickSort quickThread = new QuickSort(a.getQuickArray());
		
		
		
		insertThread.run();
	    radixThread.run();
	    quickThread.run();
	    bubbleThread.run();
	    mergeThread.run();
		
		
		System.out.println("How many random numbers?: "+number);
		System.out.println("How big is array?: "+ a.randomArrayLength());
		System.out.println("What is in randomArray?: "+ a.getRandomArrayInt());
		System.out.println("What array is potentially being passed? : "+
				"\n"+Arrays.toString(a.getQuickArray())+"\n"+Arrays.toString(a.getBubbleArray())+
				"\n"+Arrays.toString(a.getRadixArray())+"\n"+Arrays.toString(a.getMergeArray())
				+"\n"+Arrays.toString(a.getInsertionArray()));
		
	
		
		

}
}