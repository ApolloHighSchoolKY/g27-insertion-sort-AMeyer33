import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int x = 1; x < myNumbers.length; x++)
		{
			//Check with each of the numbers in the sorted list
			for(Integer y: sorted)
				//If this number is less than one in the sorted list,
				//insert it there
			if(myNumbers[x] < sorted[y])
			{
				sorted.add(myNumbers[x]);
			}
			//If it was not inserted, stick it on the end.
			if(myNumbers[x] > sorted[y])
			{
				sorted.add(myNumbers[x]);
			}

		//End Loop for unsorted list
		}
		

		//Move the data back to the array
		//Print the contents of the array
		System.out.println(sorted);
    }


}
