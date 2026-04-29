import java.util.*;

class Solution {
    int[] queens;
    int count = 0;
    int size;

    public int solution(int n) {
        size = n;
        queens = new int[n];

        dfs(0);

        return count;
    }

    public void dfs(int row) {
        if (row == size) {
            count++;
            return;
        }

        for (int col = 0; col < size; col++) {
            if (canPlace(row, col)) {
                queens[row] = col;
                dfs(row + 1);
            }
        }
    }

    public boolean canPlace(int row, int col) {
        for (int i = 0; i < row; i++) {
            // 같은 열에 퀸이 있는 경우
            if (queens[i] == col) {
                return false;
            }

            // 같은 대각선에 퀸이 있는 경우
            if (Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }

        return true;
    }
}