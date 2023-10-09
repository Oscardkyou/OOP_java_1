
package OOP1.JavaOOP1.view;

import java.util.Scanner;

public class GeoTreeCLI<T> {
    private GeoTree<T> geoTree;
    private Scanner scanner;

    public GeoTreeCLI(GeoTree<T> geoTree) {
        this.geoTree = geoTree;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the GeoTree CLI!");
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Display tree");
            System.out.println("2. Add relationship");
            System.out.println("3. Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    displayTree();
                    break;
                case "2":
                    addRelationship();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void displayTree() {
        System.out.println("Displaying the tree:");
        for (Node<T> node : geoTree.getTree()) {
            System.out.println(node);
        }
    }

    private void addRelationship() {
        // This method can be expanded to allow users to add relationships
        System.out.println("Add relationship functionality to be implemented.");
    }
}
