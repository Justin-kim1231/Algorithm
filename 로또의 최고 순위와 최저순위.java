class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;
        /**
         *int l은 로또안에 있는 숫자이고 for (int l : lottos)는 로또 안에 있는 숫자들을 나타낸다.
         */
        for (int l : lottos) {
            if (l == 0) zero++;
            else {
                for (int w : win_nums) {
                    if (l == w) {
                        matched++;
                        break;
                    }
                }
            }
        }
        
        int min = matched;
        int max = matched + zero;
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}
