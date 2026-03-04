package needle;

import org.jboss.logging.Logger;

public interface Logs {
    static final Logger log = Logger.getLogger("needle");
    static Logger log() {
        return log;
    }
}
