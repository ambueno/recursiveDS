package immutable.list;

public class EmptyList<T> extends AbstractList<T> {

    public EmptyList(){}

    @Override
    public T Head() {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractList<T> Tail() {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractList<T> Add(T element) {
        return new ElementList<>(element, this);
    }

    @Override
    public int Size() {
        return 0;
    }
}
