public class programmers_level1_2 {
    class Solution {
        public int solution(int[] numbers) {
            int sum = 45;
            for (int i : numbers) {
                sum -= i;
            }
            return sum;
        }
    }
}