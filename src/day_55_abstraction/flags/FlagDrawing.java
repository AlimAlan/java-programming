package day_55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();
        UkrainianFlag ukrainianFlag=new UkrainianFlag();
        ukrainianFlag.draw();
        KGFlag kgFlag=new KGFlag();
        kgFlag.draw();
    }
}
