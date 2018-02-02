package pathstack;

public class ArrayStack<T> implements Stack<T> {

    private final T[] data;
    private int top = 0;

    public ArrayStack(int size) {
        data = (T[]) new Object[size];
    }

    @Override
    public void push(T element) {
        data[top++] = element;
    }

    @Override
    public T pop() {
        return data[--top];
    }

    @Override
    public boolean isEmpty() {
        return (top == 0);
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
