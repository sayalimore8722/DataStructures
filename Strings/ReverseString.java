/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/


class Solution {
    public String reverseString(String s) {
        
        int i = 0, j = (s.length()-1);
        char temp = ' ', i_char = ' ', j_char = ' ';
        char[] array = new char[1000];
        
        array = s.toCharArray();
        if(array.length>=3)
        {
            if((s.length())%2 != 0)
            {
                while(i != j)
                {
            
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
            
                    i++;
                    j--;
                }
            }
            else
            {
                
                while(j>=((s.length())/2) && i<=(((s.length()+1)/2)-1))
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
            
                    i++;
                    j--;
                }
            }
        }
        else if(array.length == 2)
        {
            temp = array[0];
            array[0] = array[1];
            array[1] = temp;
            
        }
        
        return new String(array);
        
    }
}
