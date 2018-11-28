public class TwodimensionalArrays {

    public static void main(String[] args) {
        int[][] numbers;
/*        numbers = new int[3][3];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;*/

        int[][] awr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<awr.length;i++ ){
/*            System.out.println(numbers[i][0]);*/

            for (int j=0;j<awr.length;j++){

/*                System.out.println(numbers);*/
                System.out.print(awr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
