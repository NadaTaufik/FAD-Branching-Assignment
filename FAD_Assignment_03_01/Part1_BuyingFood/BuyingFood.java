package Part1_BuyingFood;

import java.util.Scanner;

public class BuyingFood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Fried Rice : Rp. 10000");
        System.out.println("2. Fried Noodles : Rp. 11000");
        System.out.println("3. Tuna Sandwich : Rp. 12000");

        System.out.print("Choice: ");
        int choice = input.nextInt();

        System.out.print("Amount: ");
        int amount = input.nextInt();

        int price;

        switch (choice) {
            case 1: price = 10000; break;
            case 2: price = 11000; break;
            case 3: price = 12000; break;
            default:
                System.out.println("Your choice is invalid. Please, try again!");
                return;
        }

        int total = price * amount;
        System.out.println("Total price: Rp. " + total);
    }
}

