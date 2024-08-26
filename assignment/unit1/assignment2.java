package assignment.unit1;

import java.util.Scanner;


public class assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        // 质数必须大于1
        if (n <= 1) {
            return false;
        }

        // 检查从2到sqrt(n)的所有数字
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // 如果n可以被i整除，则不是质数
            }
        }

        return true; // 如果没有找到可以整除的i，则是质数
    }
    
}
