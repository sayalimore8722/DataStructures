/*
Problem Statement :
You are given a list of size , initialized with zeroes. You have to perform  operations on the list and output the maximum of final 
values of all the elements in the list. For every operation, you are given three integers ,
and you have to add value  to all the elements ranging from index  to (both inclusive).

Input Format

First line will contain two integers  and  separated by a single space.
Next  lines will contain three integers ,  and  separated by a single space.
Numbers in list are numbered from  to .

Output Format

A single line containing maximum value in the updated list.

Sample Input

5 3
1 2 100
2 5 100
3 4 100

Sample Output

200

*/

import java.util.*;

public class AlgorithmicCrush {

	public static void main(String[] args)
	{
		int[] array=new int[20];
		int temp=0;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter size:");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			array[i]=0;
		}
		
		System.out.println("Enter nu of Operations:");
		int M=sc.nextInt();
		
		for(int i=0;i<M;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int k=sc.nextInt();
			
			for(int j=a-1;j<=b-1;j++)
			{
				array[j]=array[j]+k;
			}
		}
		
		for(int i=0;i<size;i++)
		{
			if(array[i]<array[i+1])
				temp=array[i+1];
		}
		System.out.println("Max: "+temp);
	}
}

