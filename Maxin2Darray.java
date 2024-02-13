import java.util.Arrays;

public class Maxin2Darray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {23,45,23,67},
                {34,76,89},
                {43,21}
        };
        int target=76;
        int result = search(arr);
        System.out.println(result);
    }

    static int search(int [][]arr){
        int maxval=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>maxval){
                    maxval=arr[row][col];
                }
            }
        }
        return maxval;
    }
}

