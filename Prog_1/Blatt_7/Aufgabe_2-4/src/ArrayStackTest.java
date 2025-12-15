public class ArrayStackTest {
    public static void main(String[] args) {
        stringTest();
        integerTest();

    }

    private static void integerTest() {
        System.out.println("-".repeat(50) + "\n");
        ArrayStack<Integer> iAS = new ArrayStack<Integer>();

        System.out.println("Empty ArrayStack<Integer>:");
        print(iAS);

        System.out.println("Added two Element:");
        iAS.push(Integer.valueOf(1));
        iAS.push(Integer.valueOf(2));
        print(iAS);

        System.out.println("Added third Element:");
        iAS.push(Integer.valueOf(3));
        print(iAS);

        System.out.println("Added fourth and fifth Element:");
        iAS.push(Integer.valueOf(4));
        iAS.push(Integer.valueOf(5));
        print(iAS);

        System.out.print("Get top Element: ");
        System.out.println(iAS.top());
        print(iAS);

        System.out.print("Pop one Element: ");
        System.out.println(iAS.pop());
        print(iAS);

        System.out.print("Pop one Element: ");
        System.out.println(iAS.pop());
        print(iAS);

        System.out.print("Pop three Elements: ");
        System.out.println(iAS.pop() + ", " +iAS.pop() + ", " + iAS.pop());
        print(iAS);

        System.out.print("Pop one Element: ");
        System.out.println(iAS.pop());
        print(iAS);

        System.out.println("-".repeat(50));
    }

    private static void stringTest() {
        System.out.println("-".repeat(50) + "\n");
        ArrayStack<String> sAS = new ArrayStack<String>();

        System.out.println("Empty ArrayStack<String>:");
        print(sAS);

        System.out.println("Added two Element:");
        sAS.push("One");
        sAS.push("Two");
        print(sAS);

        System.out.println("Added third Element:");
        sAS.push("Three");
        print(sAS);

        System.out.println("Added fourth and fifth Element:");
        sAS.push("Four");
        sAS.push("Five");
        print(sAS);

        System.out.print("Get top Element: ");
        System.out.println("\"" + sAS.top() + "\"");
        print(sAS);

        System.out.print("Pop one Element: ");
        System.out.println("\"" + sAS.pop() + "\"");
        print(sAS);

        System.out.print("Pop one Element: ");
        System.out.println("\"" + sAS.pop() + "\"");
        print(sAS);

        System.out.print("Pop three Elements: ");
        System.out.println("\"" + sAS.pop() + "\", " + "\"" + sAS.pop() + "\", " + "\"" + sAS.pop() + "\"");
        print(sAS);

        System.out.print("Pop one Element: ");
        System.out.println("\"" + sAS.pop() + "\"");
        print(sAS);

        System.out.println("-".repeat(50));
    }

    private static void print(ArrayStack aS){
        System.out.println(aS);
        System.out.println("Capacity: " + aS.capacity());
        System.out.println("Size: " + aS.size());
        System.out.println();
    }
}
