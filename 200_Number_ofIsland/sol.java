class block {
    public boolean visited;
    public int isLand;
    
    public block(int isLand){
        this.visited = false;
        this.isLand = isLand;
    }
}
class Solution {
    private void helper(int i, int j, block[][] blocks){
        
        if (j < blocks[0].length-1
                &&blocks[i][j+1].isLand == 1 && blocks[i][j+1].visited == false){
            blocks[i][j+1].visited = true;
            helper(i,j+1, blocks);
        }
        if (i < blocks.length-1
                &&blocks[i+1][j].isLand == 1 && blocks[i+1][j].visited == false){
            blocks[i+1][j].visited = true;
            helper(i+1, j, blocks);
        }
        if (i > 0
                && blocks[i-1][j].isLand == 1 && blocks[i-1][j].visited == false){
            blocks[i-1][j].visited = true;
            helper(i-1, j, blocks);
        }
        if (j > 0
                && blocks[i][j-1].isLand == 1 && blocks[i][j-1].visited == false){
            blocks[i][j-1].visited = true;
            helper(i, j-1, blocks);
        }
        
    }
    public int numIslands(char[][] grid) {
        if (grid.length == 0)
            return 0;
        block [][] blocks = new block[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                blocks[i][j] = new block(grid[i][j] == '1'?1:0);
            }
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (blocks[i][j].isLand == 1 && blocks[i][j].visited == false){
                    helper(i,j,blocks);
                    count++;
                }
            }
        }
        
        return count;
    }
}
