/*
 * 
Problem Statement : Given an array, , of  integers, print each element in reverse order 
as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the number of integers in ). 
The second line contains  space-separated integers describing .

Constraints

Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1
 */

import java.util.*;

public class ReverseArray {
public static void main(String[] args)
{
	int a[]=new int[20];
	System.out.println("Enter Array size : ");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	System.out.println("Enter array elements : ");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("Original array : \n");
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("Reversed array : \n");
	for(int i=size-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
}
}
