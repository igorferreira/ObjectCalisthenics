package objectcalisthenics.examples.firstclassecollections;

import java.util.Collection;
import java.util.Iterator;

public class BoardRowCollection implements Collection<BoardRow> {

    private Collection<BoardRow> c;

    public BoardRowCollection(Collection<BoardRow> c) {
        this.c = c;
    }

    @Override
    public boolean add(BoardRow row) {
        c.add(row);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        c.remove((BoardRow) o);
        return false;
    }

    @Override
    public int size() {
        return c.size();
    }

    @Override
    public boolean isEmpty() {
        return c.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return c.contains((BoardRow) o);
    }

    @Override
    public Iterator<BoardRow> iterator() {
        return c.iterator();
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection c) {
        this.c = c;
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        this.c = c;
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
    }

}
