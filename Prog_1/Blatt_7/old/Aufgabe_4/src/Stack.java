/**
 * Implements an interface for a Stack of Objects {@code <E>}
 * @param <E> Type of Object to implement the interface for
 */
public interface Stack<E> {
    /**
     * Adds a new Object E to the top of the stack
     * @param element Object to be added to the stack
     */
    void push(E element);

    /**
     * Deletes the top Object on the stack, meaning the Object added last
     * @return The deleted Object, else null if the stack is empty
     */
    E pop();

    /**
     * Returns the top Object on the stack, meaning the Object added last
     * @return Last added Object, else null if the stack is empty
     */
    E top();

    /**
     * Returns a boolean representing the fact that the stack is empty
     * @return true if size() = 0, else false
     */
    boolean isEmpty();

    /**
     * Returns an int representing the size of the stack
     * @return int i = Number of Objects {@code <E>} in the Stack
     */
    int size();
}
