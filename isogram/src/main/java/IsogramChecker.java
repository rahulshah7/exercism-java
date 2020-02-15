class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        if (phrase.equals(""))
            return true;

        return false;
    }
}

/* Solve using streams */
// convert phrase string to char array
// convert char array to stream
// filter out char < a and > z
// is isogram if
// #count stream and #count distinct stream