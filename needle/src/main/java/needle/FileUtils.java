package needle;

import java.nio.file.Path;

public class FileUtils {
    
    /*
    *  Return an string of emojis containing:
    * - Directory or file indicator emoji
    * - Existence indicator emoji
    */
    static String indicatorOfPath(Path path) {
        var result = new StringBuilder();
        if (path.toFile().exists()) {
            result.append("✅");
            if (path.toFile().isDirectory()) {
                result.append("📁");
            } else if (path.toFile().isFile()) {
                result.append("📄");
            } else {
                result.append("❓");
            }
        } else {
            result.append("❌");
        }
        return result.toString();
    }
}
