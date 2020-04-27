import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();

        number = Integer.parseInt(Integer.toBinaryString(number));

        while (number > 0) {
            boolean reverseHandshake = false;
            while (number >= 10000) {
                number = number - 10000;
                reverseHandshake = true;
            }

            while (number >= 1000) {
                handshake.add(0, Signal.JUMP);
                number = number - 1000;
            }

            while (number >= 100) {
                handshake.add(0, Signal.CLOSE_YOUR_EYES);
                number = number - 100;
            }

            while (number >= 10) {
                handshake.add(0, Signal.DOUBLE_BLINK);
                number = number - 10;
            }

            while (number >= 1) {
                handshake.add(0, Signal.WINK);
                number = number - 1;
            }

            if (reverseHandshake)
                Collections.reverse(handshake);
        }

        return handshake;
    }
}