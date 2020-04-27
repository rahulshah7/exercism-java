import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> handshake = new ArrayList<>();
        number = Integer.parseInt(Integer.toBinaryString(number));

        while (number > 0) {

            boolean reverseHandshake = number >= 10000;

            number = addSignalToHandshake(handshake, number, null, 10000);
            number = addSignalToHandshake(handshake, number, Signal.JUMP, 1000);
            number = addSignalToHandshake(handshake, number, Signal.CLOSE_YOUR_EYES, 100);
            number = addSignalToHandshake(handshake, number, Signal.DOUBLE_BLINK, 10);
            number = addSignalToHandshake(handshake, number, Signal.WINK, 1);

            if (reverseHandshake) {
                Collections.reverse(handshake);
            }
        }
        return handshake;
    }

    private int addSignalToHandshake(List<Signal> handshake, int number, Signal signal, int signalValue) {
        while (number >= signalValue) {
            if (signal != null)
                handshake.add(0, signal);
            number -= signalValue;
        }
        return number;
    }
}