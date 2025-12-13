import java.util.Spliterator;
import java.util.function.Consumer;

public class ListStack<E> implements Stack<E>, Iterable<E> {

    private class ListCell<F>{
        final private F content;
        final private ListCell<F> next;
        final private ListCell<F> previous;

        protected ListCell(F content0, ListCell<F> next0, ListCell<F> previous0) {
            this.content = content0;
            this.next = next0;
            this.previous = previous0;
        }
    }

    private class Iterator<G>{
        private ListCell<G> cursor;

        protected Iterator(ListCell<G> cursor0){this.cursor = cursor0;}

        public boolean hasNext() {return cursor.next != null;}
        public ListCell<G> next() {return cursor.next;}
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
        if (isEmpty()){
            head = new ListCell<E>(element, null, null);
            tail = head;
            size++;
            return;
        }
        tail = new ListCell<E>(element, null, tail);
        size++;
    }

    @Override
    public E pop(){
        if (isEmpty()) return null;
        E top = top();
        tail = tail.previous;
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

    // TODO: wtf?!
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(head);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
