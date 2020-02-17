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

/* Solve using Hash maps */
// create Hash map. Keys are chars a to z, values = 0;
// loop over phrase chars a to z and increment Hash map value
// return false if hashmap value > 1