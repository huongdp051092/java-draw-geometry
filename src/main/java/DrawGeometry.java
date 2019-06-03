import java.util.Scanner;

public class DrawGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 4) {
            System.out.println("----------- Menu -----------");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i < 4; i++) {
                        for (int j = 1; j < 8; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int k = 1; k <= 5 - i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("No choice!");
            }
        }
    }
}
