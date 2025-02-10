public class UniquElements {
    public static void main(String[] args) {
        String str ="anaabibbcccdldd";
        int [] arr=new int[128];

        for (int i = 0; i <str.length() ; i++) {
            int position =str.charAt(i);
            arr[position]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                System.out.println((char)i);
            }
        }
    }

}
