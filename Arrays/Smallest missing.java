/*
Find the smallest positive number missing from an unsorted array
*/

import java.util.Arrays;
class Solution {
     public  static boolean binarySearch(int[] array,int num)
    {
        int mid = 0, start = 0, end = (array.length-1); 
        while(start <= end)
        {
            mid = (start + end)/2;
            
            if(array[mid] == num)
                return true;
            else if(num < array[mid])
                end = mid - 1;
            else if(num > array[mid])
                start = mid + 1;
        }
        return false;
    }
    
    public static int missingNumber(int[] nums) {
       
       boolean flag = false;
      /*  for(int i=0; i<nums.length-1; i++)
        {
                for(int j=0; j<(nums.length)-i-1; j++)
                {
                    if(nums[j]>nums[j+1])
                    {
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
        }*/
        Arrays.sort(nums);
        
    for(int i=1; i<=(nums.length+2); i++)
    {
        if(binarySearch(nums,i))
            flag = true;
        else if(i>0)
            return i;
    }
    if(flag == true)
        return (nums.length+2);
    return -1;
        
    }

	// main function
	public static void main (String[] args) 
	{
		int arr[] = {1,3,6,4,1,2};
		int missing = missingNumber(arr);
		System.out.println("The smallest positive missing number is "+ 
							missing);
	}
}
 
