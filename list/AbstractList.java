package immutable.list;

public abstract class AbstractList<T> {
    protected abstract T Head();
    protected abstract AbstractList<T> Tail();
    protected abstract AbstractList<T> Add(T element);
    protected abstract int Size();
}
