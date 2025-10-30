public class Quersumme {
    public static int quersumme(int x) {
        int sum = 0;
        while (x != 0) {         //wiederholt biss alle 1-ner stellen addiert wurden
            sum += x % 10;          //modulo von 10 ist die 1-ner stelle
            x = (x - (x % 10)) / 10;    //x ohne einzerstellelen wird durch 10 geteilt
        }
        return sum;
    }

    public static int recQuersumme(int x) {
        if (x != 0) {
            return x % 10 + recQuersumme((x - (x % 10)) / 10);
        } else {
            return x;
        }
    }
}
