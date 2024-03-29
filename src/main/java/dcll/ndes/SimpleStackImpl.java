package dcll.ndes;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Nico on 17/02/2016.
 */
public class SimpleStackImpl implements SimpleStack{

    private Stack<Item> pile;

    SimpleStackImpl(){
        pile = new Stack<Item>();
    }

    @Override
    public boolean isEmpty() {
        return pile.isEmpty();
    }

    @Override
    public int getSize() {
        return pile.size();
    }

    @Override
    public void push(Item item) {
        pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return pile.pop();
    }
}
