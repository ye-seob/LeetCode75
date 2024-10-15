import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        // 끝나는 지점을 기준으로 배열을 정렬
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        // 첫 번째 풍선에 화살을 쏘고, 첫 번째 풍선의 끝나는 지점을 기준으로 잡음
        int arrows = 1;
        int end = points[0][1];

        // 그리디하게 풍선을 순차적으로 확인
        for (int i = 1; i < points.length; i++) {
            // 현재 풍선의 시작 지점이 이전 화살로 터트릴 수 없을 때
            if (points[i][0] > end) {
                arrows++;  // 새로운 화살을 쏨
                end = points[i][1];  // 끝나는 지점을 업데이트
            }
        }

        return arrows;
    }
}
