package aeds.trabalho;

public class Complement<T> extends AbstractSet<T>{
    private final AbstractSet<T> set;

    public Complement(AbstractSet<T> set) { this.set = set; }

    @Override
    public Boolean contains(T element) { return !(set.contains(element)); }
}
