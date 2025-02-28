/**
 * A generic stack implementation using an array.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class StackClass<T> {
    private Object[] stack;
    private int size = 0;
    private int capacity;

    /**
     * Default constructor initializing with a capacity of 10.
     */
    public StackClass() {
        capacity = 10;
    }

    /**
     * Constructor with a custom stack size.
     *
     * @param c The maximum number of elements the stack can hold.
     */
    public StackClass(int c) {
        capacity = c;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element The element to push.
     * @throws StackFullException If the stack is full.
     */
    public void push(T element) throws StackFullException {
        if (size == capacity) {
            throw new StackFullException("Stack is full");
        }
        Object[] newStack = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        size++;
        stack[size - 1] = element;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return The top element.
     * @throws StackEmptyException If the stack is empty.
     */
    public Object peek() throws StackEmptyException{
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return stack[size - 1];
    }

    /**
     * Returns the top element without removing it.
     *
     * @return The top element.
     * @throws StackEmptyException If the stack is empty.
     */
    public Object pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        size--;
        Object ret=stack[size];
        stack[size] = null;
        Object[] newStack = new Object[size];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        return ret;
    }

    /**
     * Returns a string representation of the stack elements.
     *
     * @return A string with elements separated by ";"
     */
    public String list(){
        String a="";
        for(int index=0;index<size;index++){
            a+=stack[index]+";";
        }
        return a;
    }
}
