//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// problem no 744
class SmallestLetterGreaterThanTarget
{
    public static void main(String[]args)
    {
        char[] arr={'c','f','j'};
        char target='a';
        char res=nextGreatestLetter(arr,target);
        System.out.println(res);
    }
    public static char nextGreatestLetter(char[] arr, char target) {
        // what if target is greater than greatest no from array
        if(target>=arr[arr.length-1])
        {
            return arr[0];
        }
        int start=0;
        int end=arr.length-1;
        
        
        while (start<=end)
         {
            // find the middle element.
            int mid=start+(end-start)/2; // might be possible that (start + end) exceeds the range of int so optimized
            if (target<arr[mid])
             {
                end=mid-1;
                
            }
            else 
             {
                start=mid+1;
                
            }
            
            

        }
        ;
        return arr[start];
    }
}