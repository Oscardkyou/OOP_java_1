
package OOP1.JavaOOP1.model;

import java.util.Iterator;

public class GeoTreeIterator<T> implements Iterator<Node<T>> {
    private int index = 0;
    private GeoTree<T> tree;

    public GeoTreeIterator(GeoTree<T> tree) {
        this.tree = tree;
    }

    @Override
    public boolean hasNext() {
        return index < tree.getTree().size();
    }

    @Override
    public Node<T> next() {
        if (hasNext()) {
            return tree.getTree().get(index++);
        }
        return null;
    }
}

