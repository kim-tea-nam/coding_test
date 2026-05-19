class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int result = 0;
        
        for(int i = 0; i < schedules.length; i++){
            int curSchedules = schedules[i];
            
            int h = curSchedules/100; 
            int m = curSchedules%100;
            
            if(m+10 >=60) {
                h++;
                m = m-60;
            }
            
            int limitTime = h*100 + m + 10;
            
            boolean isEligible = true;
            
            for(int j = 0; j < timelogs[i].length; j++){
                int exce = (startday + j -1) % 7 + 1;
                if(exce == 6 || exce == 7) {
                    continue;
                }
                if(timelogs[i][j] > limitTime) {
                    isEligible = false;
                    break;
                }
            }
            
            if (isEligible) {
                result++;
            }
        }
        
            
        
        return result;
    }
}