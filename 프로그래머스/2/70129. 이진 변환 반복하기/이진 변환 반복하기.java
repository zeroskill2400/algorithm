class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            String convertedString = s.replaceAll("0", "");
            int zeroCounter = s.length() - convertedString.length();
            s = Integer.toBinaryString(convertedString.length());
            answer[0]++;
            answer[1] += zeroCounter;
        }
        return answer;
    }   
}