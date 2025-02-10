public class CountOfOccurances {
    public static void main(String[] args) {
        String str ="aaabbbcccddd";
        int [] arr=new int[128];

        for (int i = 0; i <str.length() ; i++) {
            int position =str.charAt(i);
            arr[position]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                System.out.println((char)i+"--->"+arr[i]);
            }
        }
    }
}
