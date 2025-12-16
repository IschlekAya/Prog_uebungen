public class ListStackTest {
    public static void main(String[] args) {
        ListStack<String> lSS = new ListStack<String>();
        System.out.println(lSS);
        lSS.push("Eins"); lSS.push("Zwei"); lSS.push("Drei"); lSS.push("Vier"); lSS.push("Fünf"); lSS.push("Sechs");
        System.out.println(lSS);
        System.out.println("Popped " + lSS.pop());
        System.out.println("Popped " + lSS.pop());
        System.out.println("Popped " + lSS.pop());
        System.out.println(lSS);
        // Does not work, here:
        // prints an endless amount of "Zwei"
        // Seems to apply the method to every String in ListStack instead of every ListCell<String> in ListStack
        // I don't know anymore
        // Send help
        // update: fixed (DO NOT look into the code)
        System.out.println("Print all contents of the ListStack");
        lSS.forEach(str -> System.out.println(str));
    }

}
