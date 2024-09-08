package Java;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number to check number is palindrome or not : ");
            num = sc.nextInt();
            if(num!=0) {
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome number");
            } else {
                System.out.println(num + " is not a palindrome number");
            }
            }
            
        } while (num != 0);
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}