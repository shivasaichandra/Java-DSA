public class CeilOfNumberBS{
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 12, 15, 17, 23, 27, 31, 43};
        int target = 27;
        int result = search(arr, target);
//        System.out.println(result);
        if(result==-1){
            System.out.println("there is no possible ceil value for the target element in the given array");
        }
        else {
            System.out.println("the ceil value for the given element is : "+result);
        }
    }

    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        if(target>arr[arr.length-1]){
            return -1;
        }

        while (low<=high) {

            int mid = (low + high) / 2;

            if(target<arr[mid]){
                high = mid-1;
            }

            else if (target>arr[mid]) {
                low = mid+1;
            }

            else {
                return arr[mid];
            }
        }

        return arr[low];

    }
}
