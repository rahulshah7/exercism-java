import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    String word;
    char[] characters;

    Anagram(String word) {
        this.word = word;
        this.characters = word.toLowerCase().toCharArray();
        Arrays.sort(this.characters);
    }

    List<String> match(List<String> words) {
        List<String> anagramList = new ArrayList<>();
        for (String word : words) {
            boolean isWordEqual = this.word.toLowerCase().equals(word.toLowerCase());
            if (!isWordEqual) {
                char[] characters = word.toLowerCase().toCharArray();
                Arrays.sort(characters);
                if (Arrays.equals(this.characters, characters)) {
                    anagramList.add(word);
                }
            }
        }
        return anagramList;
    }
}