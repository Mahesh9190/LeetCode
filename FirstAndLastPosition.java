//  Q no 34 
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

import java.util.Arrays;

class FirstAndLastPosition
{
    public static void main(String[]args)
    {
        int[]arr={5,7,7,8,8,10};
        int [] arr1=searchRange(arr, 8);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] searchRange(int[] arr, int target)
     {
        int[] ans={-1,-1};
        int start=search(arr, target, true);
        int end=search(arr, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        
    }
    public static int search(int []arr,int target,boolean findStartIndex)
    {
        int ans=-1;
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
            else if (target>arr[mid])
             {
                start=mid+1;
                
            }
            else
            {
                ans=mid;
                if(findStartIndex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            

        }
        return ans;
    }
    }
