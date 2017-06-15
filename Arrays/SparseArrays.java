/*
Problem Statement:
There is a collection of  strings ( There can be multiple occurences of a particular string ). Each string's length is no more than 
characters. There are also  queries. For each query, you are given a string, and you need to find out how many times this string 
occurs in the given collection of  strings.

Input Format

The first line contains , the number of strings.
The next  lines each contain a string.
The nd line contains , the number of queries.
The following  lines each contain a query string.

Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output

2
1
0
*/
import java.util.*;

public class SparseArrays {

	public static void main(String[] args)
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		int[] len=new int[10];
		int counter=0,i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string array size:");
		int size=sc.nextInt();
		System.out.println("Enter Strings:");
		for(i=0;i<size;i++)
		{
			String str=sc.next();
			arraylist.add(str);
		}
		
		System.out.println("Enter query string size:");
		int query_size=sc.nextInt();
		
		System.out.println("Enter Query Strings:");
		for(j=0;j<query_size;j++)
		{
			counter=0;
			String query=sc.next();
		
			for(i=0;i<arraylist.size();i++)
			{
				if(arraylist.get(i).equalsIgnoreCase(query))
				{	
				counter++;	
				}
				
			}
			len[j]=counter;
		}
		
		System.out.println("Occurances :");
		for(i=0;i<query_size;i++)
		{
			System.out.println(len[i]);
		}
	}
}


