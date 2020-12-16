package objectcalisthenics.examples.firstclassecollections;

import java.util.Collection;
import java.util.Iterator;

public class BoardColumnCollection implements Collection<BoardColumn> {

    private Collection<BoardColumn> c;


    public BoardColumnCollection(Collection<BoardColumn> c) {
        this.c = c;
    }

    @Override
    public boolean add(BoardColumn row) {
        c.add(row);
        return true;
    }

     @Override
    public boolean remove(Object o) {
        c.remove((BoardColumn)o); 
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
        return c.contains((BoardColumn) o);
    }

    @Override
    public Iterator<BoardColumn> iterator() {
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
