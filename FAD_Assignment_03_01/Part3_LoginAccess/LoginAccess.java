package Part3_LoginAccess;

import java.util.Scanner;

public class LoginAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals("admin")) {
            if (password.equals("123456")) {
                System.out.println("Welcome Admin");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Username not registered");
        }

        input.close();
    }
}
