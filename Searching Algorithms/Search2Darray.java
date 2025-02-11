import java.util.Arrays;

public class Search2Darray {

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {23,45,23,67},
                {34,76,89},
                {43,21}
        };
        int target=76;
        int[] result = search(arr,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] search(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
