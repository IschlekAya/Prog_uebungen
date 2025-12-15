import java.util.Iterator;
import java.util.function.Consumer;

public class ListStack<E> implements Stack<E>, Iterable<E> {

    public class ListCell<F>{
        final private F content;
        private ListCell<F> next;
        private ListCell<F> previous;

        protected ListCell(F content0, ListCell<F> next0, ListCell<F> previous0) {
            this.content = content0;
            this.next = next0;
            this.previous = previous0;
        }
    }

    private class ListStackIterator<G> implements Iterator<G> {
        private ListCell<G> cursor;

        protected ListStackIterator(ListCell<G> cursor0){this.cursor = cursor0;}

        public boolean hasNext() {return cursor != null;}
        public G next() {G current = cursor.content; cursor = cursor.next; return current;}
        public void remove() {cursor.previous.next = null;}
    }

    private ListCell<E> head;
    private ListCell<E> tail;
    private int size;

    public ListStack(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void push(E element){
        if (isEmpty()) {
            head = new ListCell<E>(element, null, null);
            tail = head;
        } else {
            tail.next = new ListCell<E>(element, null, tail);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E pop(){
        if (isEmpty()) return null;
        E top = top();
        tail = tail.previous;
        tail.next = null;
        size--;
        return top;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return tail.content;
    }

    @Override
    public boolean isEmpty(){return size == 0;}

    @Override
    public int size(){return size;}

    @Override
    public Iterator<E> iterator() {
        return new ListStackIterator<E>(head);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public String toString(){
        if (isEmpty()) return "[]";
        ListCell<E> currentCell = head;
        String s = "[";
        while (currentCell.next != null){
            s += currentCell.content + ", ";
            currentCell = currentCell.next;
        }
        s += currentCell.content + "]";
        return s;
    }
}
