package Test6;

public class RottenOranges {
    static boolean isSafe(int row, int col, int numRows, int numCols)
    {
        return row >= 0 && row < numRows &&
                col >= 0 && col < numCols;
    }

    static int rotOranges(int[][] grid)
    {
        boolean changed = false;
        int days = 2;
        int numRows = grid.length, numCols = grid[0].length;

        while (true)
        {
            for(int row = 0; row < numRows; row++)
            {
                for(int col = 0; col < numCols; col++)
                {
                    // Rot all other oranges present at
                    // (row+1, col), (row, col-1), (row, col+1), (row-1, col)
                    if (grid[row][col] == days)
                    {
                        if (isSafe(row + 1, col, numRows, numCols) &&
                                grid[row + 1][col] == 1)
                        {
                            grid[row + 1][col] = grid[row][col] + 1;
                            changed = true;
                        }
                        if (isSafe(row, col + 1, numRows, numCols) &&
                                grid[row][col + 1] == 1)
                        {
                            grid[row][col + 1] = grid[row][col] + 1;
                            changed = true;
                        }
                        if (isSafe(row - 1, col, numRows, numCols) &&
                                grid[row - 1][col] == 1)
                        {
                            grid[row - 1][col] = grid[row][col] + 1;
                            changed = true;
                        }
                        if (isSafe(row, col - 1, numRows, numCols) &&
                                grid[row][col - 1] == 1)
                        {
                            grid[row][col - 1] = grid[row][col] + 1;
                            changed = true;
                        }
                    }
                }
            }

            // If no rotten orange found it means all
            // oranges rottened now
            if (!changed)
                break;

            changed = false;
            days++;
        }

        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                // If any orange is found to be
                // not rotten then ans is not possible
                if (grid[row][col] == 1)
                    return -1;
            }
        }

        // Because initial value for a rotten
        // orange was 2
        return days - 2;
    }
    public static void main(String[] args)
    {
        int[][] grid = { {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};

        int days = rotOranges(grid);
        if (days == -1)
            System.out.println("All oranges cannot rot");
        else
            System.out.println("Time required for all oranges to rot = " + days);
    }

}
