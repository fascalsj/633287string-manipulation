package com.github.stringmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CharacterPositionTest {

    @Test
    public void getSingleCharacterPosition(){
        String fullText = "Fascal lulusan Unikom";
        String textForFind = "lulusan";
        Integer position = new CharacterPosition().getSingleCharacterPosition(fullText, textForFind);

        Assertions.assertEquals(7, position);
    }

    @Test
    public void getMultipleCharacterPosition(){
        String fullText = "1001001";
        String textForFind = "0";
        List<Integer> multipleCharacterPosition = new CharacterPosition().getMultipleCharacterPosition(fullText, textForFind);

        Assertions.assertEquals(multipleCharacterPosition.get(0), 1, 0);
        Assertions.assertEquals(multipleCharacterPosition.get(1), 2, 0);
        Assertions.assertEquals(multipleCharacterPosition.get(2), 4, 0);
        Assertions.assertEquals(multipleCharacterPosition.get(3), 5, 0);

    }
}
