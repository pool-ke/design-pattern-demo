package sword.offer.demo;

/**
 * @author qianji
 * @date 2019/12/29 14:25
 */
public class TwoDimensionArrayFind {
    static boolean Find (int target,int[][] array){
        int rows = array.length;
        int cols = array[0].length;
        int i = 0;
        int j = cols-1;
        while (i<rows && j>=0){
            if (array[i][j] == target){
                return true;
            }else if (array[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] arrayTest = {{1,2,3},{4,5,6},{7,8,9}};
        int targetTest = 10;
        boolean result = TwoDimensionArrayFind.Find(targetTest,arrayTest);
        System.out.println(result);
    }
}
