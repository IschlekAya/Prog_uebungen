import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.opentest4j.AssertionFailedError;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterCounterTest {

    public static void main(String[] args) {
        test_1(); // functionality readFileContent()
        test_2(); // IOException readFileContent()
        test_3(); // functionality count()
        test_4(); // NullPointerException count()
        test_5(); // StringIndexOutOfBoundsException count()
    }

    static void test_1(){  // read content from a file, ensure that output matches the contents of the file
        System.out.print("test_1: ");
        boolean passed = true;
        CharacterCounter charCounter = new CharacterCounter();
        String content = "";

        try {
            content = charCounter.readFileContent("/home/peter/Schreibtisch/HKA/Semester_1/Programmieren/Übungen/Prog_1/Blatt_9/Aufgabe_1-2/file.txt");
        } catch (FileNotFoundException ex){
            System.out.println("caught a FileNotFoundException");
            return;
        } catch (IOException e){
            System.out.println("caught an IOException\n");
            return;
        }

        try {
            String correctContent = """
                    
                    "Who’s joe?" a distant voice asks.
                    Instantly everyone nearby hears the sound of 1,000s of bricks rapidly shuffling towards his location.
                    The earth itself seemed to cry out in agony, until finally the ground itself split open and a horrific creature crawled from the ground, covered in mucus and tar.
                    ”Joe Momma…” the creature whispered.
                    The man cried out in pain as he disintegrated into dust, and the whole world fell silent in fear.
                    "I did a little trolling." the wretched creature remarked before burrowing back into the earth.""";
            assertEquals(correctContent, content);
        } catch (AssertionFailedError e){
            passed = false;
        }
        System.out.println(passed ? "passed": "failed");
    }

    static void test_2(){
        System.out.print("test_2: ");
        CharacterCounter charCounter = new CharacterCounter();
        boolean passed = false;

        try {
            String content = charCounter.readFileContent("pahsnfk");
        } catch (IOException e){
            passed = true;
        }
        System.out.println(passed ? "passed": "failed");



    }

    static void test_3(){   // create Counter from String, ensure that variables in Counter object are correct
        System.out.print("test_3: ");
        boolean passed = true;
        CharacterCounter charCounter = new CharacterCounter();
        Counter counter = null;
        Counter correctCounter = new Counter(9, 104, 575);
        try {
            counter = charCounter.count("""
                    
                    The FitnessGram™ Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues.
                    The 20 meter pacer test will begin in 30 seconds.
                    Line up at the start.
                    The running speed starts slowly, but gets faster each minute after you hear this signal. [beep]
                    A single lap should be completed each time you hear this sound. [ding]
                    Remember to run in a straight line, and run as long as possible.
                    The second time you fail to complete a lap before the sound, your test is over.
                    The test will begin on the word start.
                    On your mark, get ready,start.""");
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("caught a StringIndexOutOfBoundsException");
            return;
        } catch (NullPointerException e){
            System.out.println("caught a NullPointerException");
            return;
        }

        try{
            assertTrue(correctCounter.equals(counter));
        } catch (AssertionFailedError e){
            passed = false;
        }
        System.out.println(passed ? "passed": "failed");
    }

    static void test_4(){ // call count() with parameter null, expect NullPointerException
        System.out.print("test_4: ");
        CharacterCounter charCounter = new CharacterCounter();

        try{
            charCounter.count(null);
        } catch (NullPointerException e){
            System.out.println("passed");
            return;
        }
        System.out.println("failed");
    }

    static void test_5(){   // call count() with empty String "", expect StringOutOfBoundsException
        System.out.print("test_5: ");
        CharacterCounter charCounter = new CharacterCounter();

        try{
            charCounter.count("");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("passed");
            return;
        }
        System.out.println("failed");
    }
}
