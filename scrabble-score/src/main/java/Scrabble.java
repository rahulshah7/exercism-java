import java.util.HashMap;

public class Scrabble {
    private static final HashMap<Character, Integer> letterScores = initLetterScores();
    private final String word;
    private int score;

    public Scrabble(String word) {
       this.word = word.toUpperCase();
    }

    public int getScore() {
        for (int i = 0; i < this.word.length(); i++) {
            score += letterScores.get(this.word.charAt(i));
        }
        return score;
    }

    private static HashMap<Character, Integer> initLetterScores() {
        final char[] letters = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T', 'D', 'G', 'B', 'C', 'M', 'P', 'F', 'H', 'V', 'W', 'Y', 'K', 'J', 'X', 'Q', 'Z'};
        final int[] scores = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 8, 8, 10, 10};
        final HashMap<Character, Integer> letterScores = new HashMap<>();

        for(int i= 0; i < letters.length; i++){
            letterScores.put(letters[i], scores[i]);
        }
        return letterScores;
    }
}
