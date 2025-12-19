public class ProfessionalTestClass {
    public static void main(String[] args) {
        String stringy = "\"Who’s joe?\" a distant voice asks.\nInstantly everyone nearby hears the sound of 1,000s of bricks rapidly shuffling towards his location.\nThe earth itself seemed to cry out in agony, until finally the ground itself split open and a horrific creature crawled from the ground, covered in mucus and tar.\n”Joe Momma…” the creature whispered.\nThe man cried out in pain as he disintegrated into dust, and the whole world fell silent in fear.\n\"I did a little trolling.\" the wretched creature remarked before burrowing back into the earth.";
        int index = 0;
        int lineCounter = 0;
        if (!stringy.isEmpty()) lineCounter = 1;
        while(stringy.indexOf("\n", index) != -1){
            index += 2;
            lineCounter++;
        }
        System.out.println(lineCounter);
    }
}
