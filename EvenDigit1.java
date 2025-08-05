//Q) find no of nos that have even no of digit
class EvenDigit1
{
    public static void main(String[] args)
     {
         int [] arr={12,3,4,5,6,1234};
         System.out.println(findNumbers(arr));
        
    }
    public static int findNumbers(int [] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(even(nums[i]))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num) 
    {
        int count=0;
        while(num!=0)
        {
           
            num=num/10;
            count++;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;
        
    }
}