public class StringReverse {
    public static void main(String[] args) {
        //Method 1
        String str1="shivasai";
        String str2="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            str2+=str1.charAt(i);
        }
        System.out.println(str2);

        //Method 2 StringBuffer or StringBuilder
        StringBuffer a =new StringBuffer(str1);
        a.reverse();
        String b = new String(a);
        System.out.println(b);

        //Method 3
        char arr[] = str1.toCharArray();
        int i = 0;
        int j=arr.length-1;
        while(i<j){
            char temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String x = new String(arr);
        System.out.println(x);

    }
}
