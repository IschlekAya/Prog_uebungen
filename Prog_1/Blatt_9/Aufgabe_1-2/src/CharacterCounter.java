import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CharacterCounter {

    /**
     * Reads content of a file and returns it as a String, with the lines in the original file separated with \n{@literal .}
     * Requires a String containing the location of the wanted file on the hard drive
     * @param fileName Path to the file
     * @return Contents of the file as String, lines separated by \n
     * @throws IOException if an I/O occurs
     * @throws FileNotFoundException see {@link FileReader}
     */
    public String readFileContent(String fileName) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
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
    public Counter count(String content) throws StringIndexOutOfBoundsException, NullPointerException{
        Counter counterObject = new Counter();

        // determine row count
        int index = 0;
        while((index = content.indexOf("\n", index)+1) != 0){counterObject.increaseRowCount(1);}

        // determine word count
        String[] words = content.replaceAll("\n", " ").split(" ");
        for (String word : words) if(!word.isEmpty()) counterObject.increaseWordCount(1);   // else would include an "" left from replacing the leading \n

        // determine character count
        counterObject.setCharacterCount(content.length());
        if (content.charAt(0) == 10) counterObject.increaseCharacterCount(-1); // cant get rid of char 10 (newline) at the start of the string, no, replace and replaceAll("\n", "") do not work, appears in Strings created with StringBuilder

        return counterObject;
    }

    public static void main(String[] args){
//        double startTime = System.nanoTime();
        CharacterCounter necessary = new CharacterCounter();// why not static?
        String fileContent = "Oh no an error!";

        try {
            fileContent = necessary.readFileContent("/home/peter/Schreibtisch/HKA/Semester_1/Programmieren/Übungen/Prog_1/Blatt_9/Aufgabe_1/" + args[0]);
        } catch (IOException e){
            System.out.println("Oops! That IOException nearly hit you in the face!\nHere, good thing I caught it for you!");
            System.out.println("Your filepath was: /home/peter/Schreibtisch/HKA/Semester_1/Programmieren/Übungen/Prog_1/Blatt_9/Aufgabe_1/" + args[0]);
            return;
        } // never null as defined by initialization

        System.out.println(fileContent + "\n"); // it's funny

        try {
            System.out.println(necessary.count(fileContent));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("the file's not allowed to be empty");
        } catch(NullPointerException e){
            System.out.println("How did you get a NullPointerException all the way here?");
        }
//        double timeInMs = (System.nanoTime()-startTime)/1000000.0;
//        System.out.printf("time: %.3fms\n", timeInMs);
    }
}
