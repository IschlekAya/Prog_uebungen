/**
 * Object that stores three int variables {@link #rowCount}, {@link #wordCount} and {@link #characterCount} with respective getter/setter and an increase(by int x) method
 */
public class Counter {
    private int rowCount;
    private int wordCount;
    private int characterCount;

    public Counter(){
        rowCount = 0;
        wordCount = 0;
        characterCount = 0;
    }

    public int getRowCount() {return rowCount;}
    public void setRowCount(int rowCount) {this.rowCount = rowCount;}
    /**
     * Increases {@link #rowCount} by the amount specified in the parameter
     * @param increase Integer to be added
     */
    public void increaseRowCount(int increase) {this.rowCount += increase;}

    public int getWordCount() {return wordCount;}
    public void setWordCount(int wordCount) {this.wordCount = wordCount;}
    /**
     * Increases {@link #wordCount} by the amount specified in the parameter
     * @param increase Integer to be added
     */
    public void increaseWordCount(int increase) {this.wordCount += increase;}

    public int getCharacterCount() {return characterCount;}
    public void setCharacterCount(int characterCount) {this.characterCount = characterCount;}
    /**
     * Increases {@link #characterCount} by the amount specified in the parameter
     * @param increase Integer to be added
     */
    public void increaseCharacterCount(int increase) {this.characterCount += increase;}

    @Override
    public String toString(){
        return "Row Count: " + this.rowCount + "\nWord count: " + this.wordCount + "\nCharacter Count: "  + this.characterCount;
    }
}