import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        // Data types
        int number1 = 7;
        long number2 = 100000000;
        double number3 = 3.14;
        Boolean checked = true;
        String string1 = "Your Name";

        // Math
        double PI = Math.PI;
        double million = Math.pow(10,6);
        double Radical = Math.sqrt(2);




        // Random
        double rand1 = Math.random();
        double rand2 = Math.random()*10;

       // System.out.println(Math.round(rand2));

        // Operators
            // + - % /
        if(8%2==0){
           // System.out.println("8 is divisible by 2");
        }


        // Casting and Convertion
        int number_converted = (int) 5.5;


        // Input and Scanner
        Scanner input = new Scanner(System.in);
            // int n = input.nextInt();


        // If and for
            // if(condition) {expression}
            // for(inti;BOOL;UPDATE) {expression}


        // Arrays
            // One dimensional Array
        double[] List_zeros = new double[10]; //ten zeros
        double[] List_filled = {1,2,3,4,5,6,7,8,9,10};

                // List_filled[8] = 9
                // List_filled.length

            // Two dimensional Array
        int[][] array2_zeros = new int[3][3]; // 3 by 3 matrix
        int[][] array2_filled = {{1,2,3},{3,4,5},{6,7,8}};



        // Loop through array
        for(int i = 0;i<10;i++){
            List_zeros[i] = Math.pow(List_filled[i],2);
            //System.out.println(List_zeros[i]);
        }

        for(double number:List_zeros){
            // System.out.println(number);

        }

        //Loop Through two sedimentation array
        int[][] array3_filled = {{1,2,3},{3,4,5},{6,7,8}};

        for(int i=0;i<array3_filled.length;i++){
            for (int j=0;j<array3_filled[i].length;j++){
               System.out.println(array3_filled[i][j]);

            }

        }

    }
}