import java.util.Scanner;

public class createMenu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number to show the shape");
            System.out.println("1 is the Triangle");
            System.out.println("2 is the Square");
            System.out.println("3 is the Rectangle");
            System.out.println("0 to exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The Triangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("The Square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("The Rectangle");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    break;
                default:
                    System.out.println("");
            }
        } while (choice != 0);
    }
}
