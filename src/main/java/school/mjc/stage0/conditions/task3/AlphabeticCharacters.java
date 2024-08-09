package school.mjc.stage0.conditions.task3;

import java.lang.reflect.Array;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        // char[] englishLayout = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'q', 'w', 'v', 'y', 'z'};

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
            System.out.println("Vowel");
        } else if (character == 'b' || character == 'c' || character == 'd' || character == 'f' || character == 'g' || character == 'h' || character == 'j' || character == 'k' || character == 'l' || character == 'm' || character == 'n' || character == 'p' || character == 'r' || character == 's' || character == 't' || character == 'v' || character == 'w' || character == 'q' || character == 'z') {
            {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
