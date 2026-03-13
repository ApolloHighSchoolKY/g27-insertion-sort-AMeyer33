import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        int tempNum = 0;

        for(int x = 1; x < myNumbers.length; x++)
        {
            for(int y = 0; y < x; y++)
            {
                if(myNumbers[x] < myNumbers[y])
                {
                    tempNum = myNumbers[x];
                    for(int z = x; z > y; z--)
                    {
                        myNumbers[z] = myNumbers[z-1];
                    }
                    myNumbers[y] = tempNum;
                }
            }
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
