class SplitArray
{
    public static void main(String[]args)
    {
        int[]arr={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(arr,m));

    }
    public static int splitArray(int[] arr, int m) 
    {
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++)
        {
            start=Math.max(start,arr[i]);  
            end+=arr[i];

        }

        // binary search
        while(start<end)
        {
            int mid=start+(end-start)/2;
            // calcul;ate how many piece you can divide this in with thisn max sum

            int sum=0;
            int piece=1;
            for(int num:arr)
            {
                if(sum+num>mid)
                {
                    // you can not  add this in subarray make new array
                    // say you add this num in new subarray.then sum=num
                    sum=num;
                    piece++;
                }
                else{
                    sum +=num;
                }
            }

            if(piece>m)
            {
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return end; // here star ==end
        
    }
}