import com.sun.source.tree.BreakTree;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 12, 15, 17, 23, 27, 31, 43};
        int target = 27;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("element is not present");
        } else {
            System.out.println("element found at index : " + result);
        }
    }

    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low<=high) {

            int mid = (low + high) / 2;

            if(target<arr[mid]){
                high = mid-1;
            }

            else if (target>arr[mid]) {
                low = mid+1;
            }

            else {
                return mid;
            }
        }

        return -1;

    }

}
