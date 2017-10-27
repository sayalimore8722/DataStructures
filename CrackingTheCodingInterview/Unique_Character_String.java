/*
Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures.
*/

import java.util.*;

public class Unique_string
{
    public static boolean isUnique(String s)
    {
        int prev = 0;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i=1; i<arr.length; i++)
        {
            if(arr[prev] != arr[i])
            {
                prev++;    
            }
            else
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        
        boolean result = isUnique(s);
        System.out.println(result);
    }
}
