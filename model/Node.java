
package OOP1.JavaOOP1.model;

import java.util.ArrayList;

public class Node<T> {
    private T person;
    private ArrayList<Node<T>> parents = new ArrayList<>();
    private ArrayList<Node<T>> children = new ArrayList<>();
    private ArrayList<Node<T>> spouses = new ArrayList<>();

    public Node(T person) {
        this.person = person;
    }

    public T getT() {
        return person;
    }

    public ArrayList<Node<T>> getParents() {
        return parents;
    }

    public ArrayList<Node<T>> getChildren() {
        return children;
    }

    public ArrayList<Node<T>> getSpouses() {
        return spouses;
    }
}

