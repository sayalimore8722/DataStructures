/*
Problem Statement : 

Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

public String stringSplosion(String str) {
  String result = " ";
  char[] str_arr = str.toCharArray();
  int j = 1;
  StringBuilder sb = new StringBuilder();
  
  for(int i=0; i<str_arr.length; i++)
  {
        for(int k=0; k<j; k++)
        {
          sb = sb.append(str_arr[k]);
        }
        j++;
  }
return sb.toString();
}
