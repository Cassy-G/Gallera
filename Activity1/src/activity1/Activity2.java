
package activity1;

import java.util.Scanner;

public class Activity2 {
     public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     String name;
     float hourr, ttlh, hourrt, gw, nw;
     
     System.out.print("Enter employee name:");
     name = scan.nextLine();
     System.out.print("Enter Hourly rate: ");
     hourr = scan.nextInt();
     System.out.print("Enter total hours worked this week: ");
     ttlh = scan.nextInt();
     
     System.out.print("Wage Summary");
     System.out.print("\nEmployee: " +name);
     System.out.printf("\nHourly rate: ₱%.2f", hourr);
     System.out.print("\nHours Worked: " +ttlh);   
     System.out.printf("\nGross Weekly Wage: ₱%.2f",(hourrt = hourr * ttlh));
     System.out.printf("\nSSS Contribution (10%%): ₱%.2f", (gw = hourrt * 0.1f));
     System.out.print("\n----------------------------------");
     System.out.printf("\nNet Weekly Wage: ₱%.2f", (nw = hourrt - gw));

     }
}
