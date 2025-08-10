// Problem no 852
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

class PeakMountain
{
    public static void main(String[]args)
    {
        int []arr={1,2,3,4,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));


    }


    public  static int peakIndexInMountainArray(int[] arr) 
    {
        int start=0;
        int end=arr.length-1;
        int middle=0;
        while(start<end)
        {
             middle=start+(end-start)/2;
            if(arr[middle+1]>arr[middle])
            {
                // you are in increasing part of array 
                //look at right side
                start=middle+1;
            }
            else
            {
                // you are in decreasing part 
                //this may be ans but llok at left side 
                //this is why end=mid-1
                end=middle;
            }
        }
        /* start==end and pointing to the largest no because of the 
        2 checks above 
        start and end are always trying to find max element in the
        above 2 checks
        Hence when they are pointing to just one element, that is the 
        max one */  
        return start;

        
    }
}