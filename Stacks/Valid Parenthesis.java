/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
class Solution {
        public boolean isValid(String s) {
        boolean flag = false;
        char open_brace = ' ';
        Stack<Character> stack = new Stack<Character>();
       for(int i = 0; i < s.length(); i++)
       {
           char braces = s.charAt(i);
           
           if( braces == '(' || braces == '[' || braces == '{')
           {
               stack.push(braces);
           }
           else if( braces == ')')
           {
               if(!stack.isEmpty())
                open_brace = stack.pop();
              
               if( open_brace == '(')
                   flag = true;
               else
               {
                   flag = false;
                   break;
               }
              
           }
           else if( braces == ']')
           {
               if(!stack.isEmpty())
                    open_brace = stack.pop();
              
               if( open_brace == '[')
                   flag = true;
               else 
               {
                   flag = false;
                   break;
               }
               
           }
           else if( braces == '}')
           {
               if(!stack.isEmpty())
                open_brace = stack.pop();
               
               if( open_brace == '{')
                   flag = true;
               else
               {
                   flag = false;
                   break;
               }
            }       
       }
        if(!stack.isEmpty())
            flag = false;
       /* if(flag == true)
        {
            result = "YES";
        }
        else
        {
            result = "NO";
        }*/
        return flag;
    } 
}
