import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String username = myObj.nextLine();
        System.out.println("username is: " +username);
    }

}
