package aeds.trabalho;

public class Main {
    public static void main(String[] args){
        // c1 = {1, 2, 3, 4, 5}
        AbstractSet<Integer> c1 = new EmptySet<>();
        c1 = c1.add(1);
        c1 = c1.add(2);
        c1 = c1.add(3);
        c1 = c1.add(4);
        c1 = c1.add(5);

        // c2 = {1, 3, 5, 7, 9}
        AbstractSet<Integer> c2 = new EmptySet<>();
        c2 = c2.add(1);
        c2 = c2.add(3);
        c2 = c2.add(5);
        c2 = c2.add(7);
        c2 = c2.add(9);

        System.out.println(c1.contains(2)? "2 ∈ c1" :"2 ∉ c1");
        System.out.println(c1.contains(7)? "7 ∈ c1" :"7 ∉ c1");

        System.out.println(c2.contains(7)? "7 ∈ c2" :"7 ∉ c2");
        System.out.println(c2.contains(8)? "8 ∈ c2" :"8 ∉ c2");

        // c3 = c1 U c2 = {1, 2, 3, 4, 5, 7, 9}
        AbstractSet<Integer> c3 = c1.union(c2);

        System.out.println(c3.contains(5)? "5 ∈ c3" :"5 ∉ c3");
        System.out.println(c3.contains(12)? "6 ∈ c3" :"6 ∉ c3");

        // c4 = c1 ∩ c2 = {1, 3, 5}
        AbstractSet<Integer> c4 = c1.intersection(c2);

        System.out.println(c4.contains(3)? "3 ∈ c4" :"3 ∉ c4");
        System.out.println(c4.contains(4)? "4 ∈ c4" :"4 ∉ c4");

        // c5 = c1 - c2 = {2, 4}
        AbstractSet<Integer> c5 = c1.difference(c2);

        System.out.println(c5.contains(3)? "3 ∈ c5" :"3 ∉ c5");
        System.out.println(c5.contains(4)? "4 ∈ c5" :"4 ∉ c5");

        // c6 = complemento(c1)
        AbstractSet<Integer> c6 = c1.complement();

        System.out.println(c6.contains(2)? "2 ∈ c6" :"2 ∉ c6");
        System.out.println(c6.contains(7)? "7 ∈ c6" :"7 ∉ c6");

    }
}
