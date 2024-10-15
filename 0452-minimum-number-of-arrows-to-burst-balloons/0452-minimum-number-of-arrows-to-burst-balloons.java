import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0; // 예외 처리

        int answer = 1; 
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int right = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > right) {
                answer++;
                right = points[i][1]; 
            } else {
                right = Math.min(right, points[i][1]);
            }
        }

        return answer;
    }
}
