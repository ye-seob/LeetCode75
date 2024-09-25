import java.util.LinkedList;
import java.util.Queue;

class Solution {


    public int orangesRotting(int[][] grid) {
        int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0; // 신선한 오렌지 개수
        
        // 썩은 오렌지를 큐에 추가하고, 신선한 오렌지 개수를 셉니다.
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c}); // 썩은 오렌지 위치 저장
                } else if (grid[r][c] == 1) {
                    freshOranges++; // 신선한 오렌지 개수 증가
                }
            }
        }

        // 초기 상태에서 신선한 오렌지가 없다면 0 반환
        if (freshOranges == 0) return 0;

        int minutes = 0; // 경과 시간
        
        // BFS 탐색
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];
                
                // 4 방향 탐색
                for (int[] direction : DIRECTIONS) {
                    int newRow = r + direction[0];
                    int newCol = c + direction[1];
                    
                    // 그리드 내에 있고, 신선한 오렌지라면
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // 썩은 오렌지로 변경
                        queue.offer(new int[] {newRow, newCol}); // 새로운 썩은 오렌지 큐에 추가
                        freshOranges--; // 신선한 오렌지 개수 감소
                    }
                }
            }
            
                minutes++; // 한 분 경과
        }
        
        // 모든 신선한 오렌지가 썩었는지 확인
        return freshOranges == 0 ? minutes-1 : -1;
    }
}
