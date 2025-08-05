//https://leetcode.com/problems/richest-customer-wealth/submissions/1724498447/
class RichestWealth
{
    public static void main(String[]args)
    {
        int [][]arr={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] arr)
     {
        int maxWealth=0;
        for(int i=0;i<arr.length;i++)
        {
            int max=0;
            for(int j=0;j<arr[i].length;j++)
            {
                max+=arr[i][j];
            }
            if(max>maxWealth)
            {
                maxWealth=max;
            }
        }
        return maxWealth;
        
    }

}