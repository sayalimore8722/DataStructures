/*
Problem Statement : 
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

public int sumNumbers(String str) {
  int sum = 0;
  char[] char_arr = str.toCharArray();
  ArrayList<Integer> int_arr = new ArrayList<Integer>();
  StringBuilder sb = new StringBuilder();
  
  for(int i=0; i<str.length(); i++)
  {
    if(Character.isDigit(char_arr[i]))
    {
       sb.append(char_arr[i]);
       if(i != str.length()-1)
        continue;
    }
    
    if(sb.length() != 0)
    {
    String s = (sb.toString());
    int number = Integer.parseInt(s);
    int_arr.add(number);
    sb.setLength(0);

    number = 0;
    }
  }
  
  for(int i=0; i<int_arr.size(); i++)
  {
    sum = sum + int_arr.get(i);
  }
  return sum;
}
