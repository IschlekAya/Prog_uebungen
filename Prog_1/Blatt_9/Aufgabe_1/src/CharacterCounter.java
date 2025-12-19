import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CharacterCounter {

    /**
     * Reads content of a file and returns it as a String, with the lines in the original file separated with \n{@literal .}
     * Requires a String containing the location of the wanted file on the hard drive
     * @param fileName Path to the file
     * @return Contents of the file as String, lines separated by \n
     * @throws IOException honestly your fault if this occurs
     */
    public String readFileContent(String fileName) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder("");
        String addition = buffRead.readLine();

        while (addition != null) {
            content.append("\n").append(addition);
            addition = buffRead.readLine();
        }
        buffRead.close();

        return content.toString();
    }

    /**
     * Takes a String and generates an adjacent {@link Counter} object, adjusting all variables in said object to represent the content of the String
     * @param content String to generate a {@link Counter} for
     * @return {@link Counter} object
     */
    public Counter count(String content){
        Counter counterObject = new Counter();

        // determine character count
        counterObject.setCharacterCount(content.length());

        // determine row count
        int index = 0;
        while((index = content.indexOf("\n", index)+1) != 0){counterObject.increaseRowCount(1);}

        // determine word count
        String[] words = content.replaceAll("\n", " ").split(" ");
        for (String word : words) if(!word.isEmpty()) counterObject.increaseWordCount(1);   // else would include an "" left from replacing the leading \n

        return counterObject;
    }

    public static void main(String[] args) {

        CharacterCounter necessary = new CharacterCounter();    // why not static?
        String fileContent = "Oh no an error!";
        try {
            fileContent = necessary.readFileContent("args[0]");
        } catch (IOException e){
            System.out.println("Oops! That IOExpection nearly hit you in the face!\nHere, good thing I caught it for you!");
        }
        if (fileContent.equals("Oh no an error!")) return;

        System.out.println(fileContent);
        System.out.println(necessary.count(fileContent));
    }
}
