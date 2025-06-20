// Leetcode Question 733
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int color,boolean[][] vis,int orgColor){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=orgColor || vis[sr][sc]){
            return;
        }
        image[sr][sc] = color;
        vis[sr][sc] = true;
        //left
        helper(image,sr,sc-1,color,vis,orgColor);
        //right
        helper(image,sr,sc+1,color,vis,orgColor);
        //up
        helper(image,sr-1,sc,color,vis,orgColor);
        //down
        helper(image,sr+1,sc,color,vis,orgColor);
    }
}
