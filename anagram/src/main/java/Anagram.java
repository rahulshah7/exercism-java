import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    char[] characters;

    Anagram(String word) {
        this.characters = word.toLowerCase().toCharArray();
    }

    List<String> match(List<String> words) {
        List<String> anagramList = new ArrayList<>();
        for (String word : words) {
            char[] characters = word.toLowerCase().toCharArray();

            if (!(Arrays.equals(this.characters, characters))) {
                Arrays.sort(this.characters);
                Arrays.sort(characters);
                if (Arrays.equals(this.characters, characters)) {
                    anagramList.add(word);
                }
            }
        }
        return anagramList;
    }
}