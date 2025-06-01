package SDET;

public class Reverse {
    public static void main(String[] args) {
        String s ="surya";
        reverse( s);
    }

    static void reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.reverse().toString();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
