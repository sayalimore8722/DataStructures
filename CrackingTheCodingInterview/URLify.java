/*
Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the “true” length of the string.

Examples:
Input : "Mr John Smith", 13
Output : Mr%20John%20Smith

Input : "Mr John Smith   ", 13
Output : Mr%20John%20Smith
*/

public class URLify{
    public static String url_generator(String s){
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' ')
                sb.append("%20");
            else 
                sb.append(arr[i]);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args){
        String s = "Mr Smith Halves";
        String res = url_generator(s);
        System.out.println(res);
    }
}
