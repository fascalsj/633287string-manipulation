package com.github.fascalsj.stringmanipulator;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
class CharacterPosition {

    public Integer getSingleCharacterPosition(String fullCharacter, String textForFinding) {
        return fullCharacter.indexOf(textForFinding);
    }

    public List<Integer> getMultipleCharacterPosition(String fullCharacter, String textForFinding) {
        List<Integer> positions = new LinkedList<>();
        int position = fullCharacter.indexOf(textForFinding, 0);

        while (position != -1) {
            positions.add(position);
            position = fullCharacter.indexOf(textForFinding, position + 1);
        }

        Pattern pattern = Pattern.compile(textForFinding);
        Matcher matcher = pattern.matcher(fullCharacter);
        positions = new LinkedList<>();

        while (matcher.find()) {
            positions.add(matcher.start());
        }
        return positions;
    }
}
