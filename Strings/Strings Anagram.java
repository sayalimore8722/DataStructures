class Solution {
    public boolean isAnagram(String s, String t) {
        int count = 0;
        boolean flag = false;
        
        if(s.length() == 0 && t.length() != 0)
        {
            System.out.println("In here");
            return false;
        }
        else if(s.length() == 0 && t.length() == 0)
        {
            return true;
        }
        else if(t.length() == 0)
            return true;
        else
        {
        if(s.length() == t.length())
        {
            char[] s_array = s.toCharArray();
            char[] t_array = t.toCharArray();
            HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
           
            
            for(int i=0; i<s.length(); i++)
            {
                if(map1.get(s_array[i]) == null)
                {
                 
                    map1.put(s_array[i],1);
                }
                else
                {
                    count = map1.get(s_array[i]);
                    map1.put(s_array[i],(count+1));
                }
                
            }
            
            for(int i=0; i<t.length(); i++)
            {
                int count1 = 0;
                
                if(map1.containsKey(t_array[i]))
                {
                  count1 = (map1.get(t_array[i])); 
                }
                
                
                
                if(count1>0)
                {
                    count1--;
                    
                    if(count1 != 0)
                    {
                        map1.put(t_array[i],count1);
                    }
                    else
                    {
                        map1.remove(t_array[i]);
                        if(map1.isEmpty())
                           flag = true;
                    }
                }
            }
        }
        }
        return flag;
    }
}
