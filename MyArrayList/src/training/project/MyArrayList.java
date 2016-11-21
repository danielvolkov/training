package training.project;

import java.util.*;

/**
 * Created by daniel.volkov on 19/11/16.
 */
public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elementData;

    private int size;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }


    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return new MyArrayList.Itr();
    }

    private class Itr implements Iterator {
        int cursor = 0;
        int lastRet = -1;

        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public Object next() {
            try {
                int i = cursor;
                E next = get(i);
                lastRet = i;
                cursor = i + 1;
                return next;
            } catch (IndexOutOfBoundsException e) {
                throw new NoSuchElementException();
            }
        }
    }


    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        ensureCapacity(-1);
        elementData[size++] = e;
        return true;
    }

    private void ensureCapacity(int index) {
        if (size == elementData.length) {
            resizeArray();
        }
        if (index != -1) {
            addInToArray(index);
        }
    }


    private void resizeArray() {
        Object[] newElementData = new Object[size*3/2+1];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }

    private void addInToArray(int index) {
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
    }
    private void removeFromArray(int index){
        System.arraycopy(elementData,index,elementData,index-1,size-index);
    }

    @Override
    public boolean remove(Object o) {
        boolean result = false;
        if(o != null){
            for (int index = 0; index<size; index++) {
                if (o.equals(elementData[index])) {
                    removeFromArray(index);
                    size--;
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E get(int index) {
        if(index >= size){
            throw new NoSuchElementException();
        }
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E e) {
        elementData[index] = e;
        return null;
    }

    @Override
    public void add(int index, E e) {
        ensureCapacity(index);
        elementData[index] = e;
        size++;
    }

    @Override
    public E remove(int index) {
        removeFromArray(index);
        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        return new ListItr(0);
    }

    @Override
    public ListIterator listIterator(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: "+index);
        return new ListItr(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }

    private class ListItr extends Itr implements ListIterator {
        public ListItr(int index) {
            super();
            cursor = index;
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public Object previous() {
            int i = cursor - 1;
            if (i < 0)
                throw new NoSuchElementException();
            Object[] elementData = MyArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i;
            return (E) elementData[lastRet = i];
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Object o) {
            MyArrayList.this.set(lastRet, (E) o);

        }

        @Override
        public void add(Object o) {
            try {
                int i = cursor;
                MyArrayList.this.add(i, (E) o);
                cursor = i + 1;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }

        }
    }
}
