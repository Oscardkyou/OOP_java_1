
package OOP1.JavaOOP1.view;

import OOP1.JavaOOP1.presenter.GeoTreePresenter;
import OOP1.JavaOOP1.model.Person;
import OOP1.JavaOOP1.model.Relationship;
import OOP1.JavaOOP1.model.Research;
import java.util.Scanner;

public class GeoTreeCLI {
    private GeoTreePresenter presenter;
    private Scanner scanner;

    public GeoTreeCLI(GeoTreePresenter presenter) {
        this.presenter = presenter;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        initializeSampleData();
        System.out.println("Welcome to the GeoTree CLI!");
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Display tree");
            System.out.println("2. Save tree to file");
            System.out.println("3. Load tree from file");
            System.out.println("4. Sort tree by name");
            System.out.println("5. Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    presenter.displayTree();
                    break;
                case "2":
                    System.out.print("Enter file path to save: ");
                    String savePath = scanner.nextLine();
                    presenter.saveTree(savePath);
                    break;
                case "3":
                    System.out.print("Enter file path to load from: ");
                    String loadPath = scanner.nextLine();
                    presenter.loadTree(loadPath);
                    break;
                case "4":
                    presenter.sortByName();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void initializeSampleData() {
        // Sample data from the Main class
        // This can be moved to a separate method or class if needed
        // ... (rest of the logic from the Main class)
    }
}
