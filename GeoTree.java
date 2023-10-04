
package OOP1.JavaOOP1;

import java.util.ArrayList;

public class GeoTree<T> {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // Parent-child relationship
    public void appendParentChild(Person parent, Person child) {
        tree.add(new Node(parent, Relationship.PARENT, child));
        tree.add(new Node(child, Relationship.CHILD, parent));
    }

    // Wife-husband relationship
    public void appendWifeHusband(Person wife, Person husband) {
        tree.add(new Node(wife, Relationship.WIFE, husband));
        tree.add(new Node(husband, Relationship.HUSBAND, wife));
    }
}
