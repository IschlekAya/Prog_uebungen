// mit getField() zugrif auf das ganze feld
// mit makeMove() züge spielen
// mit resetField() feld auf leer zuruck zu machen
// mit orintField() aktueles feld in conole printen (nur zur test zweken)
public class Field {
    private char[] fieldTypes = {'X', 'O', '#'};
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
    public void resetField(){
        newField();
    }
    public void makeMove(boolean player, int x, int y) {
        if (player) {//true ist X
            field[x][y] = fieldTypes[0];
        } else {//false ist y
            field[x][y] = fieldTypes[1];
        }
    }
    public void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]);
            }
            System.out.print("\n");
        }
    }
}
