class Solution {
    public boolean judgeCircle(String moves) {
        int u_count = 0, d_count = 0, l_count = 0, r_count = 0;
        
        for(int i=0;i<moves.length();i++)
        {
            char c = moves.charAt(i);
            if(c == 'U')
                u_count++;
            else if(c == 'D')
                d_count++;
            else if(c == 'L')
                l_count++;
            else if(c == 'R')
                r_count++;
        }
        if(l_count == r_count && u_count == d_count)
            return true;
        else 
            return false;
        
    }
}
