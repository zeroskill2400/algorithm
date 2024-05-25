import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ", -1);
        System.out.println(Arrays.toString(strArr));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArr.length; i++) {
            sb.append(makeJadenCase(strArr[i]));
            if(i != (strArr.length - 1)) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public String makeJadenCase(String originString) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        char[] charArr = originString.toCharArray();
        for(char data : charArr) {
            if(isFirst) {
                sb.append(String.valueOf(data).toUpperCase());
                isFirst = false;
            } else {
                sb.append(String.valueOf(data).toLowerCase());
            }
        }
        return sb.toString();
    }
}