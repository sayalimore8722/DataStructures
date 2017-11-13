/*
Problem Statement : 
Return an array that contains the sorted values from the input array with duplicates removed.


sort([]) → []
sort([1]) → [1]
sort([1, 1]) → [1]
*/
int[] sort(int[] a) {
  ArrayList<Integer> res = new ArrayList<Integer>();
  int prev = 0;
  if(a.length == 0)
    return a;
  for(int i=0; i<a.length; i++)
  {
    for(int j=0; j<a.length-1-i; j++)
    {
      if(a[i] > a[i+1])
      {
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
      }
    }
  }
  
  prev = a[0];
  res.add(prev);
  for(int i=1; i<a.length; i++)
  {
    if(prev != a[i])
    {
      res.add(a[i]);
      prev = a[i];
    }
  }
  int[] result = new int[res.size()];
  for(int i=0; i<res.size(); i++)
  {
    result[i] = res.get(i);
  }
  
  return result;
}
