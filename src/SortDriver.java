import java.util.Random;


public class SortDriver {
	static Integer number;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println(randomArray[2]);
		Window w = new Window();
		number = w.getNumber();
		ArrayGen a = new ArrayGen(number);
		InsertionSort R1= new InsertionSort();
		R1.begin();
	   // MergeSort m = new MergeSort(mergeArray);
		//SortDriver s = new SortDriver();
		//System.out.println("How many random numbers?: "+number);
		//System.out.println("How big is array?:"+randomArray.length);
}
}