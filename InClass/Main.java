
public class Main
{
    public static void main(String[] args)
    {
        int[] nums = new int[3];
        nums[0] = 10;
        nums[2] = -5;

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = -1;
        }

        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}
