
public class Main
{
    public static void main(String[] args)
    {
        // create array that will hold three ints
        int[] nums = new int[3];

        // change the values at index 0 and 2
        nums[0] = 10;
        nums[2] = -3;

        // count number of even values in the array
        int c = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int v = nums[i];

            if(v % 2 == 0)
            {
                c++;
            }
        }
        System.out.println("The array has " + c + " even numbers.");
        
        // set all values in the array to -1
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = -1;
        }

        // print the values in the array
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}

