public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        for(int x = 1; x < myNumbers.length; x++)
        {
            int current = myNumbers[x];
            int j = myNumbers[x] - 1;
            while(j >= 0 && myNumbers[j] > current)
            {
                myNumbers[j+1] = myNumbers[j];
                j--;
            }
            myNumbers[j+1] = current;
        }
        System.out.println(myNumbers);
    }
}
