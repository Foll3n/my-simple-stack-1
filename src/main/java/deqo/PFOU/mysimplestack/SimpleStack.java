package deqo.PFOU.mysimplestack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class SimpleStack implements ISimpleStack {

    private LinkedList<Item> stack;

    public SimpleStack() {
        this.stack = new LinkedList<>();
    }

    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){
	System.out.println("is stack empty ?");
        return stack.isEmpty();
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize(){
        return stack.size();
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
        stack.push(item);
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException{
        //if(isEmpty()) throw new EmptyStackException();

        return stack.getFirst();
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{
        Item item = peek();
        stack.pop();
        return item;
    }
}
