// 832. Flipping an image
// https://leetcode.com/problems/flipping-an-image/description/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // To reverse every row and invert the image
            for (int i = 0 ; i<(image[0].length+1)/2;i++){
                // swapping and doing Xor with 1 to invert every element
                int temp = row[i]^1;
                row[i]=row[image[0].length-1-i]^1;
                row[image[0].length-1-i] = temp ;
            }
        }
        return image;
    }
}