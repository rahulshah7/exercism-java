import java.util.ArrayList;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase.isEmpty()) {
            return true;
        }

        phrase = phrase.toLowerCase();
        ArrayList<Character> letters = new ArrayList<>();
        for (char character : phrase.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                if (letters.contains(character)) {
                    return false;
                }
                letters.add(character);
            }
        }

        return true;
    }

}

/* Solve using streams */
// convert phrase string to char array
// convert char array to stream
// filter out char < a and > z
// is isogram if
// #count stream and #count distinct stream

/* Solve using loops and Arrays.sort */
// create letters array
// loop over phrase and copy chars to letters array
// sort letters array
// loop over letters from 1 to length
// if i - 1 == i return false
// return true by default