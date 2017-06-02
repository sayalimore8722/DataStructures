/*
Problem Statement :

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required 
to make  and  anagrams. Any characters can be deleted from either of the strings.

Input Format

The first line contains a single string, . 
The second line contains a single string, .

Constraints

It is guaranteed that  and  consist of lowercase English alphabetic letters (i.e.,  through ).
Output Format
Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input

cde
abc

Sample Output

4
*/

import java.util.*;
import java.util.Scanner;

public class StringsAnagram {
public static void main (String[] args)
{
	HashMap<Character,Integer> strMap=new HashMap<Character,Integer>();
	HashMap<Character,Integer> strMap2=new HashMap<Character,Integer>();
	char charCmp;
	int count=0,val=0,final_count=0,condition_var=0;
	boolean flag=false;
	
	
	System.out.println("Enter first string: \n");
	Scanner sc=new Scanner(System.in);
	String first=sc.nextLine();
	System.out.println(first);
	
	System.out.println("Enter seccond string: \n");
	String second=sc.nextLine();
	System.out.println(second);
	
	for(int i=0;i<first.length();i++)
	{
		count=0;
		System.out.println("In in for");
		char c=first.charAt(i);
		
		for(int j=0;j<first.length();j++)
		{
		if(c==first.charAt(j))
		{
			count++;
		}
			
		}
		
		
		System.out.println("char : "+c);
		System.out.println("count : "+count);
		
		strMap.put(c,count);
	    
	}
    strMap.forEach((k,v)->System.out.println(k+" , "+v));
	for(int i=0;i<second.length();i++)
	{
		count=0;
		System.out.println("In in for");
		char c=second.charAt(i);
		
		for(int j=0;j<second.length();j++)
		{
		if(c==second.charAt(j))
		{
			count++;
		}
			
		}
		
		
		System.out.println("char : "+c);
		System.out.println("count : "+count);
		
		strMap2.put(c,count);
	    
	}
	strMap2.forEach((k,v)->System.out.println(k+" , "+v));
	
	Set firstset=strMap.entrySet();
	Iterator i=firstset.iterator();

	
	
	while(i.hasNext())
	{
		System.out.println("In first while");
		Map.Entry me=(Map.Entry)i.next();
		char c=(char) me.getKey();
		int value=(int) me.getValue();
		System.out.println("Key : "+c);
		System.out.println("Value : "+value);
		
		Set secondset=strMap2.entrySet();
		Iterator i1=secondset.iterator();
		while(i1.hasNext())
		{
			condition_var=0;
			System.out.println("In second while");
			Map.Entry me1=(Map.Entry)i1.next();
			char c1=(char) me1.getKey();
			int value1=(int) me1.getValue();

			System.out.println("Key : "+c1);
			System.out.println("Value : "+value1);
			
			if(c==c1)
			{
				if(value>value1)
				{
					System.out.println("-----------------1st is greater");
					while(value!=value1)
					{
						value--;
					}
					System.out.println("################ Value : "+value);
					final_count++;
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ Conter : "+final_count);
				}
				else if(value1>value)
				{
					System.out.println("*****************2nd is greater : "+c1);
					System.out.println("*****************2nd is greater : "+value1);
					System.out.println("*****************2nd is greater : "+c);
					System.out.println("*****************2nd is greater : "+value);
					while(value!=value1)
					{
						value1--;
					}
					System.out.println("################# Value1 : "+value1);
					final_count++;
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ Conter : "+final_count);
				}
				else if(value==value1)
				{
					System.out.println("+++++++++++++++++Equal");
				}
				flag=true;
				condition_var=1;
				break;
			}
			else
			{
				flag=false;
				
			}
			System.out.println("&&&&&&&&&&&&&&&&&&& Flag : "+flag);
			System.out.println("&&&&&&&&&&&&&&&&&&& Condition var : "+condition_var);
		}
		if(flag==false && condition_var==0)
		{
			System.out.println("$$$$$$$$$$$$$$$$$ Key : "+c);
			System.out.println("$$$$$$$$$$$$$$$$$ value : "+value);
			final_count++;
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ Conter : "+final_count);
		}
	}

	Set secondset1=strMap2.entrySet();
	Iterator k=secondset1.iterator();

	
	
	while(k.hasNext())
	{
		System.out.println("In first while");
		Map.Entry me=(Map.Entry)k.next();
		char c=(char) me.getKey();
		int value=(int) me.getValue();
		System.out.println("Key : "+c);
		System.out.println("Value : "+value);
		
		Set firstset1=strMap.entrySet();
		Iterator k1=firstset1.iterator();
		while(k1.hasNext())
		{
			System.out.println("In second while");
			Map.Entry me1=(Map.Entry)k1.next();
			char c1=(char) me1.getKey();
			int value1=(int) me1.getValue();

			System.out.println("Key : "+c1);
			System.out.println("Value : "+value1);
			
			if(c==c1)
			{
				flag=true;
				condition_var=1;
				break;
			}
		
			System.out.println("&&&&&&&&&&&&&&&&&&& Flag : "+flag);
			System.out.println("&&&&&&&&&&&&&&&&&&& Condition var : "+condition_var);
		}
		if(flag==false && condition_var==0)
		{
			System.out.println("$$$$$$$$$$$$$$$$$ Key : "+c);
			System.out.println("$$$$$$$$$$$$$$$$$ value : "+value);
			final_count++;
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ Conter : "+final_count);
		}
	}
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Final Count : "+final_count);

}
}
