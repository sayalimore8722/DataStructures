/*
Problem Statement :
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
*/

public int maxSpan(int[] nums) {
 int left = 0, right = nums.length-1, max = 0, first = 0;
 ArrayList<Integer> visited = new ArrayList<Integer>();
 
 while(left<nums.length && right>=0)
 {
   first = nums[left];
   if(!visited.contains(first))
   {
     while(nums[right] != first)
     {
       right--;
     }
     
     if(right-left+1 > max)
        max = right-left+1;
   }
  left++;
  right = nums.length-1;
  visited.add(first);
 }
 
 return max;
}
