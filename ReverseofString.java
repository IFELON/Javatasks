public class ReverseofString {

    public static void main(String[] args) {
        String s = args[0];

        char[] ch = s.toCharArray();

        for (int i = ch.length-1; i >= 0; i--){
            System.out.println(ch[i]);

        }
    }
}
