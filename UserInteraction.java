
package OOP1.JavaOOP1;

import java.util.Scanner;

public class UserInteraction {
    private GeoTree<?> tree;

    public UserInteraction(GeoTree<?> tree) {
        this.tree = tree;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose an action:");
            System.out.println("1. Add person/animal");
            System.out.println("2. View all");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add person/animal logic
                    System.out.println("Feature not implemented yet.");
                    break;
                case 2:
                    for (Node<?> node : tree) {
                        System.out.println(node.getPerson().toString());
                    }
                    break;
                case 3:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

