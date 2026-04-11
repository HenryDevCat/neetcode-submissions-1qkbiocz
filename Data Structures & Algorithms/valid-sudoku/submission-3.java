class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[board.length];
        int[] cols = new int[board.length];
        int[] boxes = new int[board.length];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                // Important to skip . as it is valid by default!!!
                if (board[r][c] == '.') {
                    continue;
                }
                
                int val = board[r][c];
                int box = (r / 3) * 3 + (c / 3); 
                if ((rows[r] & (1 << val)) > 0 ||
                    (cols[c] & (1 << val)) > 0 ||
                    (boxes[box] & (1 << val)) > 0) {
                        return false;
                    }
                rows[r] |= (1 << val);
                cols[c] |= (1 << val);
                boxes[box] |= (1 << val);
            }
        }

        return true;
    }
}
