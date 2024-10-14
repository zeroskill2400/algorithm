import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String operation : operations) {
            if(operation.charAt(0) ==  'I') {
                int val = Integer.parseInt(operation.substring(2, operation.length()));
                minQueue.add(val);
                maxQueue.add(val);
            } else if(operation.charAt(0) == 'D') {
                if(operation.charAt(2) == '-') {
                    maxQueue.remove(minQueue.poll());
                } else {
                    minQueue.remove(maxQueue.poll());
                }
            }
        }
        
        if(minQueue.isEmpty() && maxQueue.isEmpty()) {
            answer = new int[]{0, 0};
        } else {
            answer = new int[]{maxQueue.peek(), minQueue.peek()};
        }
        return answer;
    }
}