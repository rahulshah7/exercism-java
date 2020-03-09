import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final Duration GIGA_SECOND = Duration.ofSeconds(1_000_000_000);
    private final LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        validateMomentParameterNotNull(moment);
        this.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        validateMomentParameterNotNull(moment);
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plus(GIGA_SECOND);
    }

    private void validateMomentParameterNotNull(Object moment) {
        if (moment == null) {
            throw new IllegalArgumentException("Parameter \"moment\" cannot be null.");
        }
    }
}
