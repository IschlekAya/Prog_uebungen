public class Test {
    public static void main(String[] args) {
        IntList l = new IntList();
        l.addFirst(15);
        l.addFirst(75);
        l.addFirst(375);
        l.addLast(3);
        System.out.println(l);
        System.out.println("First Cell: " + l.getFirst());
        System.out.println("Last Cell: " + l.getLast());
        System.out.println("Removed first Cell: " + l.dropFirst());
        System.out.println(l);
        System.out.println("Removed last Cell: " + l.dropLast());
        System.out.println(l);
        System.out.println("List contains 15: " + l.contains(15));
        System.out.println("List contains 3: " + l.contains(3));
        System.out.println("List contains " + l.size() + " values");
        System.out.println("Empty List contains " + new IntList().size() + " values");
        System.out.println(("List is empty: " + l.isEmpty()));
        System.out.println("Empty List is empty: " + new IntList().isEmpty());

        IntList n = new IntList();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 4; j++){
                n.addFirst(j);
            }
        }
        System.out.println(n);
        n.remove(3);
        System.out.println(n);
        for (int i = 0; i < 4; i++){
            n.addFirst(3);
            n.addLast(4);
        }
        System.out.println(n);
        n.remove(4);
        System.out.println(n);

        IntList o = new IntList();
        o.remove(7);
        for (int i = 0; i < 10; i++){
            o.addFirst(7);
        }
        o.remove(7);
        System.out.println(o);

    }
}
