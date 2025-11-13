// nur zur ausgabe und eingabe benuzt
public class UI {
    void printGameState(boolean player,char[][] field)
    {   String out="";
        char p;
        if(player) {p='X';}
        else {p='O';}
        out +="TickTackToe\n\n";
        out+="Player "+p+"\n";
        out+=field[1]+"\n";


    }
}
