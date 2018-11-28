import java.util.ArrayList;

public class ADD {

    int i;
    String j;
    String k;
     public ADD(int i,String j){
         this.i =i;
         this.j = j;
     }
     public String add(){
         k= i+" "+j;

         return k;
    }

    public static void main(String[] args) {
        ADD a = new ADD(0,"Suri");

        System.out.println(a.add());
    }
    }

