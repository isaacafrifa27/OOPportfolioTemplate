import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    public static void main(String[] args) {
     double currentSalary;
     double raise = 0;
     double newSalary;
     String ratings;

     Scanner scan = new Scanner(System.in);

     System.out.println("Enter the current salary: ");
     currentSalary = scan.nextDouble();
     System.out.println("Enter the perfomance rating (Excellent, Good, or Poor): ");
     ratings = scan.next();

     if (ratings.equals("Excellent")) {
      raise = currentSalary * 0.06;
     }
     else if (ratings.equals("Good")) {
      raise = currentSalary * 0.04;
     } else if (ratings.equals("Poor")) {
      raise = currentSalary * 0.0015;
     }


     newSalary = currentSalary + raise;


     NumberFormat money = NumberFormat.getCurrencyInstance();
     System.out.println();
     System.out.println("Current Salary: " + money.format(currentSalary));
     System.out.println("Amount of your raise: " + money.format(raise));
     System.out.println("Your new salary: " + money.format(newSalary));
     System.out.println();

    }
}
