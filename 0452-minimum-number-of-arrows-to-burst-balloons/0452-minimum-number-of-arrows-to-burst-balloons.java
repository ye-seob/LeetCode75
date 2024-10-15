import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        int answer = 1;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int current = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > current){
                answer++;
                current = points[i][1];
            }
            
        }

        return answer;
    }
}
