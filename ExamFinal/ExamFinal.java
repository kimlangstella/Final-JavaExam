
package com.mycompany.final_exam;
import java.util.Scanner;

public class ExamFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int Number = scanner.nextInt();
        int[] numbers = new int[Number];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < Number; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Input numbers:");
        for (int i = 0; i < Number; i++) {
            System.out.println(numbers[i]);
        }
        scanner.close();
    }
}

