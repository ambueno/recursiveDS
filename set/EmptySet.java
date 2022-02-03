package aeds.trabalho;

public class EmptySet<T> extends AbstractSet<T>{

    @Override
    public Boolean contains(T element) { return false; }
}
