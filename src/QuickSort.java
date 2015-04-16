import java.util.Arrays;
public class QuickSort {
//-----------------------------------------------------------
	private static <Integer extends Comparable<Integer>>
			void swap(Integer[] data, int index1, int index2)
		{
			Integer temp = data[index1];
			data[index1] = data[index2];
			data[index2] = temp;
		}

//-----------------------------------------------------------
		public static <Integer extends Comparable<Integer>>
			void quickSort(Integer[] data)
		{
			quickSort(data, 0, data.length - 1);
		}
//----------------------------------------------------------
		private static <Integer extends Comparable<Integer>>
			void quickSort(Integer[] data, int min, int max)
		{
			if (min < max)
			{
				// create partitions
				int indexofpartition = partition(data, min, max);

				// sort the left partition (lower values)
				quickSort(data, min, indexofpartition - 1);

				// sort the right partition (higher values)
				quickSort(data, indexofpartition + 1, max);
			}
		}
//-------------------------------------------------------------
		private static <Integer extends Comparable<Integer>>
			int partition(Integer[] data, int min, int max)
		{
			Integer partitionelement;
			int left, right;
			int middle = (min + max) / 2;

			// use the middle data value as the partition element
			partitionelement = data[middle];
			// move it out of the way for now
			swap(data, middle, min);

			left = min;
			right = max;
//LISTEN HERE
			while (left < right)
			{
				// search for an element that is > the partition element
				while (left < right && data[left].compareTo(partitionelement) <= 0)
					left++;
//LISTEN HERE
				// search for an element that is < the partition element
				while (data[right].compareTo(partitionelement) > 0)
					right--;
//LISTEN HERE
				// swap the elements
				if (left < right)
					swap(data, left, right);
			}

			// move the partition element into place
			swap(data, min, right);
//LISTEN HERE
			return right;
		}
	}//ends BubbleSort.java