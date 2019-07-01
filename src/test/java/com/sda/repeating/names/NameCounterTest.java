package com.sda.repeating.names;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameCounterTest {

    @Test
    public void ifSpaceEqualsZero (){
        String space = " ";
        NameCounter spaceString = new NameCounter(space);
        int number = spaceString.sumOfLetters();
        assertEquals(0, number);
    }

    @Test
    public void ifAIsOne(){
        String aLetter = "a";
        NameCounter aString = new NameCounter(aLetter);
        int number = aString.sumOfLetters();
        assertEquals(1, number);
    }

    @Test
    public void ifJanIls58(){
        String jan = "Jan Ul";
        NameCounter tesstName = new NameCounter(jan);
        int number = tesstName.sumOfLetters();
        assertEquals(58, number);
    }


}
