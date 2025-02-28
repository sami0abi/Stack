public class main {
    public static void main(String[] args) {
        try {
            // Testing with Integer Stack
            StackClass<Integer> numberStack = new StackClass<>(5);
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number Stack: " + numberStack.list());

            System.out.println("Popped: " + numberStack.pop());
            System.out.println("Peek: " + numberStack.peek());
            System.out.println("Number Stack after pop: " + numberStack.list());

            // Testing with String Stack
            StackClass<String> textStack = new StackClass<>(3);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text Stack: " + textStack.list());

            System.out.println("Popped: " + textStack.pop());
            System.out.println("Peek: " + textStack.peek());

            // Testing StackEmptyException
            textStack.pop(); // Should work
            textStack.pop(); // Should throw StackEmptyException

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

