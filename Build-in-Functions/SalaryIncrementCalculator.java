
import java.util.Scanner;

// // Salary Increment Calculator
// Given base salary and hike %, calculate new salary with 2 decimal precision.
// Input: 50000 10
// Output: New Salary: 55000.00

// // 
public class SalaryIncrementCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Current Salary: ");
        int sal = sc.nextInt();
        System.out.println("Enter Your Hike in %: ");
        int hike = sc.nextInt();
        double newSal = sal + (sal * hike / 100);
        System.out.printf("New Salary: %.2f",newSal);
    }
    
}
