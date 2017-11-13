/*
Problem Statement :

Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public boolean canBalance(int[] nums) {
  int k = 1;
  
  while(k <= nums.length-1)
  {
    int sum = 0, sum1 = 0;
    for(int i=0; i<k; i++)
    {
      sum = sum + nums[i];
    }
    
    for(int j=nums.length-1; j>=k; j--)
    {
      sum1 = sum1 + nums[j]; 
    }
    
    if(sum1 == sum)
      return true;
    k++;
  }
  
  return false;
}

//Use one Pointer total sum and reduce the left elements from it
