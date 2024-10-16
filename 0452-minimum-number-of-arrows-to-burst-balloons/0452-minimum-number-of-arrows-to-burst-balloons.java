import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int answer = 1;
        int right = points[0][1]; 

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > right) {
                answer++;
                right = points[i][1];
            }
        }

        return answer;
    }
}
