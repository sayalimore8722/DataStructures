/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

*/


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        boolean flag = false;
        int count = 0;
        HashMap<Character,Integer> magazine1 = new HashMap<Character,Integer>();
        if(magazine.length() == 0 && ransomNote.length()==0)
            return true;
        else if(ransomNote.length()==0)
            return true;
        
         for(int i=0; i<magazine.length(); i++)
        {
            
            char c = magazine.charAt(i);
            if(magazine1.containsKey(c))
            {
                count = magazine1.get(c);
               
                magazine1.put(c,count+1);
            }
            else
            {
                magazine1.put(c,1);
            }
            
            
        }
        for(int i=0; i<ransomNote.length(); i++)
        {
            
            char c = ransomNote.charAt(i);
         
            if(magazine1.containsKey(c) && magazine1.get(c)>0)
            {
               
            
                flag = true;
                count = magazine1.get(c);
                
                magazine1.put(c,(count-1));
            }
            else
            {
                flag = false;
                return flag;
            }
            
            
        }
       
        return flag;
        
    }
}
