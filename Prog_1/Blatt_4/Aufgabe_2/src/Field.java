public class Field {
    private char[] fieldTypes = {'X', 'O', ' '};
    private char[][] field = new char[3][3];

    public Field() {
        newField();
    }

    private void newField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = fieldTypes[2];
            }
        }
    }

    public char[][] getField() {
        return field;
    }

    public void makeMove(boolean player, int x, int y) {
        if (player) {//true ist X
            field[x][y] = fieldTypes[0];
        } else {//false ist y
            field[x][y] = fieldTypes[1];
        }
    }

    public void printField() {
        System.out.printf(
                        " 0 1 2 x\n" +
                        "0%c|%c|%c\n" +
                        " -+-+-\n" +
                        "1%c|%c|%c\n" +
                        " -+-+-\n" +
                        "2%c|%c|%c\n"+
                "y\n",
                field[0][0], field[1][0], field[2][0],
                field[0][1], field[1][1], field[2][1],
                field[0][2], field[1][2], field[2][2]);
    }
}
