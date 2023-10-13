
package OOP1.JavaOOP1.service;

import OOP1.JavaOOP1.model.GeoTree;
import OOP1.JavaOOP1.model.Node;
import java.util.List;
import java.util.Collections;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class GeoTreeService implements TreeLoader, TreeSaver, TreeSorter {
    private GeoTree tree;

    public GeoTreeService(GeoTree tree) {
        this.tree = tree;
    }

    // Method to get all nodes from the tree
    public List<Node> getAllNodes() {
        return tree.getTree();
    }

    // Method to save the tree to a file
    public void saveTree(String filePath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(tree);
        }
    }

    // Method to load the tree from a file
    public void loadTree(String filePath) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            tree = (GeoTree) ois.readObject();
        }
    }

    // Method to sort the tree nodes by name
    public void sort(SortStrategy strategy) { strategy.sort(tree); }

    public void sortByName() { sort(new SortByNameStrategy());
        List<Node> nodes = tree.getTree();
        Collections.sort(nodes, (n1, n2) -> n1.getPerson().getName().compareTo(n2.getPerson().getName()));
    }
    
    // Additional sorting methods can be added here
}
