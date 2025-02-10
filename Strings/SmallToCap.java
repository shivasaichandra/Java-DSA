public class SmallToCap {
    public static void main(String[] args) {
        String str ="shivasai";
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            str2+=(char) (str.charAt(i)-32);
        }
        System.out.println(str2);

    }
}
