class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int exce = 7 - startday;
        int result = 0;
        
        for(int i = 0; i < schedules.length; i++){
            for(int j = 0; j < timelogs[i].length; j++){
                if(exce-1 == j || exce == j) {
                    continue;
                }
                if(timelogs[i][j] == schedules[i] || timelogs[i][j] <= schedules[i]+10) {
                    result++;
                }
            }
        }
            
        
        return result;
    }
}