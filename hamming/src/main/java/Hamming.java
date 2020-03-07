class Hamming {
    private String leftStrand;
    private String rightStrand;
    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        validateOnlyOneStrandLengthNotZero(leftStrand, rightStrand);
        validateStrandLengthsEqual(leftStrand, rightStrand);
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        for (int i = 0; i < rightStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                this.hammingDistance++;
            }
        }
        return this.hammingDistance;
    }

    private void validateOnlyOneStrandLengthNotZero(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() ^ rightStrand.isEmpty()) {
            String exceptionMessage = " strand must not be empty.";
            if (leftStrand.isEmpty()) {
                throw new IllegalArgumentException("left" + exceptionMessage);
            }
            if (rightStrand.isEmpty()) {
                throw new IllegalArgumentException("right" + exceptionMessage);
            }
        }
    }

    private void validateStrandLengthsEqual(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
}
