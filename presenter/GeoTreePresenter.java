
package OOP1.JavaOOP1.presenter;

import OOP1.JavaOOP1.service.GeoTreeService;
import OOP1.JavaOOP1.model.Node;
import java.io.IOException;
import java.util.List;

public class GeoTreePresenter {
    private GeoTreeService service;

    public GeoTreePresenter(GeoTreeService service) {
        this.service = service;
    }

    public void displayTree() {
        List<Node> nodes = service.getAllNodes();
        for (Node node : nodes) {
            System.out.println(node);
        }
    }

    public void saveTree(String filePath) {
        try {
            service.saveTree(filePath);
            System.out.println("Tree saved successfully to " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving the tree: " + e.getMessage());
        }
    }

    public void loadTree(String filePath) {
        try {
            service.loadTree(filePath);
            System.out.println("Tree loaded successfully from " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading the tree: " + e.getMessage());
        }
    }

    public void sortByName() {
        service.sortByName();
        System.out.println("Tree sorted by name.");
    }
    
    // Additional methods to interact with the tree can be added here
}
