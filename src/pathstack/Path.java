package pathstack;

public interface Path<T> {

    public T getFirst();

    Path<T> getRest();

}
