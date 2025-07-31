class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int nn=image.length;
        for(int[]row:image){
            for(int i=0;i<(nn+1)/2;i++){
                int temp=row[i]^1;
                row[i]=row[nn-1-i]^1;
                row[nn-1-i]=temp;
            }
        }
        return image;
    }
}