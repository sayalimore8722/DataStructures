/*
Problem Statement :
Create a list,seqList , of N empty sequences, where each sequence is indexed from  to . The elements within each of the  sequences also use -indexing.
Create an integer, last answer, and initialize it to .
The  types of queries that can be performed on your list of sequences (seqList) are described below:
Query: 1 x y
Find the sequence, , at index ((x^lastAnswer%N)) in seqList.
Append integer y to sequence seq.
Query: 2 x y
Find the sequence, , at index  in .seq((x^lastAnswer)%N)seqList
Find the value of element y% size in seq (where  is the size of seq) and assign it to lastAnswer.
Print the new value of lastAnswer on a new line
Task 
Given N, Q, and  Qqueries, execute each query.

Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.

Input Format

The first line contains two space-separated integers, N (the number of sequences) and Q (the number of queries), respectively. 
Each of the  subsequent lines contains a query in the format defined above.

Output Format

For each type Q query, print the updated value of  on a new line.

Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output

7
3
*/

import java.util.*;

public class DynamicArray {
public static void main(String[] args)
{
	int last_Answer=0;
	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<Integer> a2=new ArrayList<Integer>();
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter N:");
	int N=sc.nextInt();
	
	System.out.println("Enter Q:");
	int Q=sc.nextInt();
	
	for(int i=0;i<Q;i++)
	{
		System.out.println("Enter query:");
		int q=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(q==1)
		{
			int seq=((x^last_Answer)%N);
			System.out.println("Seq is : "+seq);
			if(seq==0)
				a1.add(y);
			else if(seq==1)
				a2.add(y);
			
		}
		else if(q==2)
		{
			int seq=((x^last_Answer)%N);
			System.out.println("Seq is : "+seq);
			int len=a1.size();
			int index=(y%len);
			if(seq==0)
			{
			last_Answer=a1.get(index);
			System.out.println("Last Answer:"+last_Answer);
			}
			else if(seq==1)
			{
			last_Answer=a2.get(index);
			System.out.println("Last Answer:"+last_Answer);
			}
			
		}
	}
}
}

