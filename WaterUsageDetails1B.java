import java.util.Scanner;
public class WaterBillCalculator {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(scanner.in);
 System.out.print("Enter water consumption in litres: ");
  double consumption = scanner.nextDouble();
 int bill;
  if (consumption <= 500) {
   bill = 100;
   } else {
  bill = 200;
        }
 System.out.println("The water bill is: Rs. " + bill);
   scanner.close();
    }
}
