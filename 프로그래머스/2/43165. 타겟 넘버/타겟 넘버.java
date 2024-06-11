class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(answer, 0, target, numbers);
        return answer;
    }
    public static int dfs(int currentSum, int steps, int target, int[] numbers) {
        if(steps == numbers.length) {
            if(currentSum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(currentSum + numbers[steps], steps + 1, target, numbers) +
        dfs(currentSum - numbers[steps], steps + 1, target, numbers);
    }
}