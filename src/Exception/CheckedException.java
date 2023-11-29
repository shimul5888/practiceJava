package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
  /* public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;
        try {result = numerator/denominator;
            System.out.println("Result:" + result);}
        catch (ArithmeticException e) {
            System.out.println("Error: + Division by Zero is not allowed");}
        System.out.println("Program continues after the try-catch block");
    }
    /*public static void main(String[] args) {
        try {
            int[] numbers = {2, 4, 6, 9};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("something went wrong");

        }//
    }*/
