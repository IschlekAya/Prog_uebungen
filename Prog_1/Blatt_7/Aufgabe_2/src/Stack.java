/**
 * A generic Stack interface representing a Last-In-First-Out (LIFO)
 * collection of elements.
 *
 * @param <E> the type of elements stored in the stack
 */
public interface Stack<E> {

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element the element to be added to the stack
     */
    void push(E element);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    E pop();

    /**
     * Returns, but does not remove, the element at the top of the stack.
     *
     * @return the element at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    E top();

    /**
     * Checks whether the stack contains no elements.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return the number of elements in the stack
     */
    int size();
}
