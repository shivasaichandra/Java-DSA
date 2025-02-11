public class EvenDigits {

    public static void main(String[] args) {
        int [] arr = {123,54,67890,0,98,123,3432,1234,56,123456};
        System.out.println(findnumbers(arr));
    }

    private static int findnumbers(int[] arr) {
        int count =0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int noofDigits=digits(num);
        if(noofDigits%2==0){
            return true;
        }
        return false;
    }

    private static int digits(int num) {
//        int count=0;
//        if(num<0){
//            num = num*-1;
//        }
//
//        if(num==0){
//            return 1;
//        }
//
//        while (num>0){
//            count++;
//            num = num /10;
//        }
//        return count;

        // above one or below one both are okay to use
        if(num<0){
            num = num*-1;
        }
        int count = (int)Math.log10(num)+1;
        return count;
    }

}
