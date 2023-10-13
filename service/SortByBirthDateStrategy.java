
package OOP1.JavaOOP1.service;

import OOP1.JavaOOP1.model.Node;
import java.util.Comparator;
import java.util.List;

public class SortByBirthDateStrategy implements SortStrategy {
    @Override
    public void sort(List<Node> tree) {
        tree.sort(Comparator.comparingInt(node -> node.getPerson().getBirthDate()));
    }
}
