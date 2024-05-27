import java.util.*;

class Solution {
    public int solution(int n) {
        int target = n + 1;
        int answer = 0;
        
        while(true) {
            if(Integer.bitCount(n) == Integer.bitCount(target)) {
                answer = target;
                break;
            }
            target++;
        }
        return answer;
    }
}