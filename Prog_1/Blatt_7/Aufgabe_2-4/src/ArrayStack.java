/**
 * Creates an array consisting of {@code <E>} objects{@literal .}
 * The array can take Integer.MAX_VALUE objects and shrinks/expands according to the amount of objects contained{@literal .}
 * The array doubles its size when full and halves its size when >=60% empty
 * @param <E> Object type to be stored in the array
 */
public class ArrayStack<E> implements Stack<E> {
    /**
     * Array containing objects E
     */
    private E[] array;
    /**
     * capacity of the array, meaning the amount of objects that can fit into the array
     */
    private int capacity;
    /**
     * size of the array, meaning the amount of objects currently contained in the array
     */
    private int size;

    /**
     * Creates a new, empty ArrayStack with the array having a length of one
     */
    public ArrayStack() {
        this.array = (E[]) new Object[1];  // can't create a new E[] Object at runtime (idk why don't ask me), therefore create Object[] and cast it to E[] later
        this.capacity = 1;
        this.size = 0;
    }

    /**
     * Doubles the capacity of {@link #array} when called and adjusts the value of {@link #capacity} to correctly display that change{@literal .}
     * @return true if {@link #capacity} < Integer.MAX_VALUE/2
     */
    private boolean doubleCapacity(){
        if (capacity > Integer.MAX_VALUE/2) return false;
        capacity *= 2;

        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
        return true;
    }

    /**
     * Reduces the capacity of {@link #array} by half when called, as long as capacity > 1{@literal .}
     * Adjusts the value of {@link #capacity} to correctly display that change
     * @return true if {@link #capacity} > 1
     */
    private boolean halfCapacity(){
        if (capacity <= 1) return false;
        capacity /= 2;

        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
        return true;
    }

    /**
     * Adds a new Object E to the top of the stack
     * @param element Object to be added to the stack
     */
    public void push(E element){
        // increases array capacity if necessary
        if (capacity == size){
            if (!this.doubleCapacity()) {
                System.out.println("Can't add another object to the array as the array's capacity can't be increased anymore");
                return;
            }
        }

        array[size] = element;
        size++;
    }

    /**
     * Deletes the top Object on the stack, meaning the Object added last
     * @return The deleted Object, else null if the stack is empty
     */
    public E pop(){
        if (isEmpty()) return null;
        E top = top();
        array[size-1] = null;
        size--;
        // decreases capacity if <= 40% of the array is full
        if (size == 0 || (size*100)/capacity <= 40) halfCapacity();
        return top;
    }

    /**
     * Returns the top Object on the stack, meaning the Object added last
     * @return Last added Object, else null if the stack is empty
     */
    public E top(){
        if (isEmpty()) return null;
        return array[size-1];
    }

    /**
     * Returns a boolean representing the fact that the stack is empty
     * @return true if size() = 0, else false
     */
    public boolean isEmpty() {return size == 0;}

    /**
     * Returns an int representing the size of the stack
     * @return Number of Objects {@code <E>} != null in the Stack
     */
    public int size() {return size;}

    /**
     * Returns an int representing the capacity of the stack
     * @return Number of Objects {@code <E>} that can fit in the Stack
     */
    public int capacity() {return capacity;}

    /**
     * Collects all toString()-representations of each element in the list (excluding null's),
     * separates them with a comma and surrounds the entire structure with []-braces{@literal .}
     * Might not yield expected result if the elements don't contain a sophisticated toString()-method,
     * therefore only recommended for testing purposes.
     * @return String containing each element != null
     */
    @Override
    public String toString(){
        if (isEmpty()) return "[]";

        String s = "[";
        for (int i = 0; i < size-1; i++){
            s += array[i] + ", ";
        }
        s += array[size-1] + "]";
        return s;
    }
}