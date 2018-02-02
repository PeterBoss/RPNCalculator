package pathstack;

/**
 *
 * @author Peter
 */
public interface Stack<T> {

    void push(T element);

    T pop();

    boolean isEmpty();

    public void print();
}
