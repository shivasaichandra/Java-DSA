public class MaxWealth {

    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(maximumwealth(arr));
    }

    public static int maximumwealth(int[][]arr){
        int result = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum =0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if(sum>result){
                result=sum;
            }
        }

        return result;
        }
    }


