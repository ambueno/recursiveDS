package aeds.trabalho;

public abstract class AbstractSet<T> {
    public abstract Boolean contains(T element);
    AbstractSet<T> add(T element){ return new ElementSet<T>(element, this); }
    AbstractSet<T> union(AbstractSet<T> set){ return new Union<>(set, this); }
    AbstractSet<T> intersection(AbstractSet<T> set){ return new Intersection<>(set, this); }
    AbstractSet<T> difference (AbstractSet<T> set){ return new Difference<>(set, this); }
    AbstractSet<T> complement(){ return new Complement<T>(this); }
}
