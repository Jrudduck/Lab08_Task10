import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = InputHelper.getNonZeroLenString(scan, "Enter your username.");
        System.out.println("Your username is " + username);

    }
}