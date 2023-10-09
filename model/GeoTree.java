
package OOP1.JavaOOP1.model;

import java.util.ArrayList;

public class GeoTree<T> implements Iterable<Node<T>> {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // Parent-child relationship
    public void appendParentChild(T parent, T child) {
        tree.add(new Node(parent, Relationship.PARENT, child));
        tree.add(new Node(child, Relationship.CHILD, parent));
    }

    // Wife-husband relationship
    public void appendWifeHusband(T wife, T husband) {
        tree.add(new Node(wife, Relationship.WIFE, husband));
        tree.add(new Node(husband, Relationship.HUSBAND, wife));
    }

    // Sort by name
    public void sortByName() {
        tree.sort((node1, node2) -> node1.getPerson().getName().compareTo(node2.getPerson().getName()));
    }

    // Sort by birth date
    public void sortByBirthDate() {
        tree.sort((node1, node2) -> node1.getPerson().getBirthDate().compareTo(node2.getPerson().getBirthDate()));
    }


    @Override
    public Iterator<Node<T>> iterator() {
        return tree.iterator();
    }

}