package aeds.trabalho;

public class ElementSet<T> extends AbstractSet<T>{
    private final T value;
    private final AbstractSet<T> set;

    public ElementSet(T value, AbstractSet<T> set) {
        this.value = value;
        this.set = set;
    }

    @Override
    public Boolean contains(T element) { return element.equals(value) || set.contains(element); }
}

