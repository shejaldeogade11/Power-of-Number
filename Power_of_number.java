package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

//power in between power and number
public class Power_of_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        System.out.println("Enter the power of number:");
        int pow = s.nextInt();
        int value = 1;
        for (int i = 1; i <= pow; i++) {
            value = value * num;
        }
        System.out.println(num + "^" + pow + " = " + value);
    }
}
