import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Integer> intStack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) == '(') {
              intStack.push(0);
          } else {
              if(intStack.empty()) {
                  answer = false;
                  break;
              } else {
                  intStack.pop();
              }
          }
        }
        if(!intStack.empty()) {
            answer = false;
        }
        return answer;
    }
}