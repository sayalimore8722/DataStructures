/*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, 
which means it moves back to the original place.The move sequence is represented by a string. And each move is represent by a character. 
The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot
makes a circle.

Input: "UD"
Output: true

Input: "LL"
Output: false
*/
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
