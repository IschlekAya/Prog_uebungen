public class Main{
    public static void main(String[] args)
    {
        GenericStack<String> X = new GenericStack<String>();
        X.push("1");
        X.debug();
        X.push("1");
        X.debug();
        X.push("CLANKER!!!");
        X.debug();
        X.pop();
        X.pop();
        X.debug();
        System.out.println(X.isEmpty());
    }
}