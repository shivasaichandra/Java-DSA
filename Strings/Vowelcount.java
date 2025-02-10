public class Vowelcount {
    public static void main(String[] args) {
         String str1 ="aBcei12@#$WS";
         str1 =str1.toLowerCase();
        int vc=0,cc=0,nc=0,sc=0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = (char) (str1.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vc++;
            }
            else if( ch>=65 && ch<=122){
                cc++;
            } else if (ch>=48 && ch<=57) {
                nc++;
            }
            else {
                sc++;
            }
        }
        System.out.println(vc);
        System.out.println(cc);
        System.out.println(nc);
        System.out.println(sc);
    }
}
