package immutable.list;

public class ElementList<T> extends AbstractList<T> {
    private final T head;
    private final AbstractList<T> tail;

    public ElementList(T  head, AbstractList<T> tail) {
        this. head = head;
        this.tail = tail;
    }

    @Override
    public T Head() {
        return head;
    }

    @Override
    public AbstractList<T> Tail() {
        return tail;
    }

    @Override
    public AbstractList<T> Add(T element) {
        return new ElementList<>(element, this);
    }

    public int Size() {
        return (1 + tail.Size());
    }
}

