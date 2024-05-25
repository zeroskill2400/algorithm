class Solution {
    public int[] solution(String s) {
        Dto dto = new Dto(0, s);
        int[] answer = new int[2];
        while(!dto.convertedString.equals("1")) {
            dto = binaryConversion(dto);
            answer[0]++;
            answer[1] = dto.zeroCounter;
        }
        return answer;
    }
    public Dto binaryConversion(Dto dto) {
        int count = dto.zeroCounter;
        for(int i =0; i < dto.convertedString.length(); i++) {
            if(dto.convertedString.charAt(i)=='0') {
                count++;
            }
        }
        return new Dto(count, Integer.toBinaryString(dto.convertedString.replaceAll("0", "").length()));
    }
}
class Dto {
    int zeroCounter;
    String convertedString = "";

    Dto(int zeroCounter, String convertedString) {
        this.zeroCounter = zeroCounter;
        this.convertedString = convertedString;
    }
}