class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rows = new HashSet<>(); // [i,val]
        Set<String> cols = new HashSet<>(); // [j,val]
        Set<String> boxes = new HashSet<>(); // [i / 3,j / 3,val] e.g. [0,0,7]

        boolean checkRow = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                String rowVal = "[" + i + "," + board[i][j] + "]";
                String colVal = "[" + j + "," + board[i][j] + "]";
                String boxVal = "[" + (i / 3) + "," + (j / 3) + "," + board[i][j] + "]";
                
                if (rows.contains(rowVal) ||
                    cols.contains(colVal) ||
                    boxes.contains(boxVal)) {
                        return false;
                    }
                rows.add(rowVal);
                cols.add(colVal);
                boxes.add(boxVal);
            }
        }
        return true;
    }
}
