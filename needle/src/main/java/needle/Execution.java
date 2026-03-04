package needle;

import java.time.LocalDateTime;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Execution {
    public static final LocalDateTime START_TIME = LocalDateTime.now();

    public String startTimeStr() {
        return START_TIME.toString();
    }

}
