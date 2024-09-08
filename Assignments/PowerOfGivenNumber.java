package Java;

import java.util.Scanner;

public class PowerOfGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println(" Menu : ");
            System.out.println("1. Calculate Power using Math.pow() ");
            System.out.println("2. Calculate Power using User-Defined Function ");
            System.out.println("3. Calculate Power using For Loop ");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    MathPow(sc);
                    break;
                case 2:
                    UserDefinedFunction(sc);
                    break;
                case 3:
                    ForLoop(sc);
                    break;
                case 4:
                    System.out.println("Exited ");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again!!!");
            }
        }
    }

    static void MathPow(Scanner sc) {
        int number, power;
        System.out.print("Enter number : ");
        number = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();
        System.out.println(number + "^" + power + " is: " + (int) Math.pow(number, power));
    }

    static void UserDefinedFunction(Scanner sc) {
        int number, power;
        System.out.print("Enter number: ");
        number = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();
        System.out.println(number + "^" + power + " is: " + power(number, power));
    }

    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result =result * base;
        }
        return result;
    }

    static void ForLoop(Scanner sc) {
        int number, power;
        System.out.print("Enter number: ");
        number = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result =result* number;
        }
        System.out.println(number + "^" + power + " is: " + result);
    }
}