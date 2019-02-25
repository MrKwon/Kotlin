public class Solution{
    public String solution(int n1, int n2, int K){
        char[] answer = new char[n1 + n2];
        for (int i = 0; i < answer.length; i++)
            answer[i] = 'M';

        int point = 0;
        int counter = n2;
        while (counter-- > 0) {
            if (point < n1 + n2) {
                point += K;
            } else {
                point += (K + (point / (n1 + n2)));
                System.out.println(point);
            }
            int index = point % answer.length;
            answer[index] = 'F';
        }
        return new String(answer);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, 5, 3));
    }
}