package aeds.trabalho;

public class Union<T> extends AbstractSet<T>{
    private final AbstractSet<T> set1, set2;

    public Union(AbstractSet<T> set1, AbstractSet<T> set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    @Override
    public Boolean contains(T element) { return (set1.contains(element) || set2.contains(element)); }
}
