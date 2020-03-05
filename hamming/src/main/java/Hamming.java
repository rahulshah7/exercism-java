class Hamming {
    private String leftStand;
    private String rightStand;
    private int hammingDistance = 0;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStand = leftStrand;
        this.rightStand = rightStrand;
    }

    int getHammingDistance() {
        for (int i = 0; i < rightStand.length(); i++) {
            if (leftStand.charAt(i) != rightStand.charAt(i)) {
                this.hammingDistance++;
            }
        }
        return this.hammingDistance;
    }
}
