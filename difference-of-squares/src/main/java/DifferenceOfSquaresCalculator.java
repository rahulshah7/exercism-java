class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int result = input * (input + 1) / 2;
        return result * result;
    }

    int computeSumOfSquaresTo(int input) {
        int result = input * (input + 1) * (2 * input + 1) / 6;
        return result;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
