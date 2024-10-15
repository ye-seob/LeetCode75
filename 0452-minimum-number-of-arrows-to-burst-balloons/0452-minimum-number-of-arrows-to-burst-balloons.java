import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0; // 예외 처리

        int answer = 1; // 최소 화살 개수
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0])); // 시작점 기준 정렬

        int left = points[0][0]; // 첫 번째 풍선의 시작점
        int right = points[0][1]; // 첫 번째 풍선의 종료점

        for (int i = 1; i < points.length; i++) {
            // 현재 풍선의 시작점이 이전 풍선의 종료점보다 크면 새로운 화살 필요
            if (points[i][0] > right) {
                answer++;
                left = points[i][0]; // 새로운 시작점
                right = points[i][1]; // 새로운 종료점
            } else {
                // 겹치는 경우, 종료점을 업데이트
                right = Math.min(right, points[i][1]);
            }
        }

        return answer;
    }
}
