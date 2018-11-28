public class Stringmethods {

    public static void main(String[] args) {

        String name = "SANJAY";
        String str  = "Sahuu";

        // charAt Method
        char char_at = name.charAt(2);
        System.out.println("CharAt :"+ char_at);

        //Equals Method
        boolean equal = name.equals(str);
        System.out.println("Equals :"+equal);

        //UpperCase
        String str1 = str.toUpperCase();
        System.out.println("To Uppercase :"+str1);

        //LowerCase
        String str2 = name.toLowerCase();
        System.out.println("Lower case :"+ str2 );

        //Compare
         int compare = str.compareTo(name);
        System.out.println("Compare :"+ compare);

        //Concat
         String concat = name.concat(str);
        System.out.println("Concat :"+concat);

        //endsWith
        boolean end =  name.endsWith("A");
        System.out.println("Ends with :"+end);

        //Indexof
         int index = name.indexOf("A");
        System.out.println("Index of :"+index);

        // Is empty
        boolean empty1 = str.isEmpty();
        System.out.println("is Empty :"+empty1 );
    }
}
