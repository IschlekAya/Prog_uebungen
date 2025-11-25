import java.util.Scanner;

// Tic-Tac-Toe board with a 3x3 grid
public class Game {
    static Scanner scanner = new Scanner(System.in);
    Field[][] board;

    // create new empty Field
    public Game(){
        board = new Field[3][3];

        // initialize empty Field
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = Field.EMPTY;  // note: i = row (0-2), j = column (0-2)
            }
        }


    }

    // returns true if answer to another round is "y"
    static boolean anotherRound(){
        System.out.print("Would you like to play another game y/n: ");
        String answer = scanner.next().toLowerCase();
        return (answer.equals("y"));
    }

    // print the current state of the board
    private void print(){
        // go through row 0-2
        for (int row = 0; row < 3; row++){
            System.out.println("+-----".repeat(3) + "+");

            // print current row
            for (int column = 0; column < 3; column++){
                String string = "";
                switch (board[row][column]){
                    case CROSS: string += "X"; break;
                    case CIRLCE: string += "O"; break;
                    case EMPTY: string += " "; break;
                    default: string += "?"; break;
                }

                System.out.printf("|%d %s %d",column, string, row);
            }
            System.out.println("|");

        }
        System.out.println("+-----".repeat(3) + "+");

    }

    // allow player p to place his symbol on field Board[x][y], return false if field isn't empty
    private boolean place(Player p){
        System.out.print("It's Player " + p + "'s turn!\nPick a Column: ");
        int column = scanner.nextInt();
        // choose another field if selected column is out of range
        if (column < 0 || column > 2){
            System.out.println("Invalid Selection!\nPlease choose a column between integer 0 and 2\n");
            return place(p);
        }

        System.out.print("Pick a Row: ");
        int row = scanner.nextInt();
        // choose another row if selected row is out of range
        if (row < 0 || row > 2){
            System.out.println("Invalid Selection!\nPlease choose a row between integer 0 and 2\n");
            return place(p);
        }

        // choose another field if selected field is occupied
        if (board[row][column] != Field.EMPTY){
            System.out.println("Invalid Selection!\nPlease choose an empty field\n");
            return place(p);
        }

        System.out.println();   // pretty
        board[row][column] = Field.toField(p);
        return true;
    }

    // detects horizontal win
    private boolean horizontalWin(Player p, int row){
        for (int column = 0; column < 3; column++){
            if (board[row][column] != Field.toField(p)) return false;
        }
        return true;
    }

    // detects vertical win
    private boolean verticalWin(Player p, int column){
        for (int row = 0; row < 3; row++){
            if (board[row][column] != Field.toField(p)) return false;
        }
        return true;
    }

    // detects a diagonal win from top Left to bottom Right
    private boolean diagonalWin_LtR(Player p){
        for (int i = 0; i < 3; i++){
            if (board[i][i] != Field.toField(p)) return false;
        }
        return true;
    }

    //detects a diagonal win from top Right to bottom Left
    private boolean diagonalWin_RtL(Player p){
        if (board[0][2] != Field.toField(p)) return false;
        return (board[2][0] == Field.toField(p));   // we can skip [1][1], as it has already been checked
    }

    // detect if given player p has won
    private boolean hasWon (Player p){
        // horizontal win   NOTE: board[row][column]
        for(int row = 0; row < 3; row++) {
            if (horizontalWin(p, row)) return true;
        }
        // vertical win
        for(int column = 0; column < 3; column++){
            if (verticalWin(p, column)) return true;
        }
        // diagonal win Left to Right
        if (board[1][1] != Field.toField(p)) return false;  // middle field -> has to be true for a diagonal win to be possible
        if (diagonalWin_LtR(p)) return true;
        if (diagonalWin_RtL(p)) return true;

        return false;
    }

    // detects if there is no empty field left
    private boolean noMoreMoves(){
        for (Field[] fieldArray : board){
            for (Field field : fieldArray){
                if (field == Field.EMPTY) return false;
            }
        }
        return true;
    }

    static void run(){
        Game board = new Game();
        Player p = Player.CIRCLE;   // Player CROSS starts the game
        board.print();
        boolean winnerExists = false;
        boolean noMoreMoves = false;

        do{
            p = (p == Player.CROSS ? Player.CIRCLE : Player.CROSS);   // switch player after each turn
            board.place(p);
            board.print();
            winnerExists = board.hasWon(p);
            noMoreMoves = board.noMoreMoves();
        } while (!winnerExists && !noMoreMoves);

        if (winnerExists) {
            System.out.println("Player " + p + " has won the game!\n");
        }
        else if (noMoreMoves){
            System.out.println("The game has ended in a draw.\n");
        }

        if (anotherRound()) run();  // play again
        scanner.close();
    }

}
