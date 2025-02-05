import java.util.Scanner;

public class Electric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount = 0;

        switch (value(units)) {
            case 1: 
                billAmount = units * 5;
                break;

            case 2: 
                billAmount = (100 * 5) + ((units - 100) * 7);
                break;

            case 3:
                billAmount = (100 * 5) + (100 * 7) + ((units - 200) * 10);
                break;

            case 4: 
                billAmount = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 300) * 15);
                break;

            default:
                System.out.println("Invalid input! Units must be greater than 0.");
            
        }

        System.out.println("Total electricity bill: Rs " + billAmount);
        sc.close();
    }

    private static int value(int units) {
        if (units <= 100) {
            return 1;
        } else if (units <= 200) {
            return 2;
        } else if (units <= 300) {
            return 3;
        } else if (units > 300) {
            return 4;
        } else {
            return -1; // Invalid range
        }
    }
}
