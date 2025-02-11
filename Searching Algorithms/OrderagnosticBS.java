public class OrderagnosticBS {
    public static void main(String[] args) {
        int[] arr = {99,89,79,69,59,49,39,29,19,9,-9,-19};
        int target = 9;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("element is not present");
        } else {
            System.out.println("element found at index : " + result);
        }
    }

    static int search(int [] arr,int target){
        int low =0;
        int high=arr.length-1;

        boolean IsAsc;
        if(arr[low]<arr[high]){
            IsAsc=true;
        }
        else {
            IsAsc=false;
        }

        while (low<=high){
            int mid = (low + high) / 2;
            if(target==arr[mid]){
                return mid;
            }


            if(IsAsc){
                if(target<arr[mid]){
                    high = mid-1;
                }
                else if (target>arr[mid]) {
                    low = mid+1;
                }
            }

            else {
                if(target>arr[mid]){
                    high = mid-1;
                }
                else if (target<arr[mid]) {
                    low = mid+1;
                }
            }

        }

        return -1;
    }
}
