public enum Constants {
    MONDAY(1,"lazy day"),TUESDAY(2,"traditional day"),WEDNES(3,"Wedding day"),THURSDAY(4,"Traditional day"),FRIDAY(5,"Funny day"),SATURDAY(6,"Sleeping day"),SUNDAY(7,"RepeatMode");

    private int num;
    private  String s;
    Constants(int num, String s) {

        this.num = num;
        this.s = s;

    }
    public int getnum(){
        return num;
    }
    public String getS(){
        return s;
    }

    public static void main(String[] args) {
        Constants con = Constants.valueOf(args[0]);

        switch (con){
            case MONDAY:
                System.out.println(1 +" "+"Lazy day");
                break;
            case TUESDAY:
                System.out.println(2 +" "+"traditional day");
                break;
            case WEDNES:
                System.out.println(3 +" "+ "Wedding day");
                break;
            case THURSDAY:
                System.out.println(4+" "+"Traditional day");
                break;
            case SATURDAY:
                System.out.println(5+ " "+ "Funny day");
                break;
            case SUNDAY:
                System.out.println(6 + " "+"Repeat Mode");
        }


    }
}
