package needle;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import needle.config.NeedleConfig;
import static needle.Logs.log;

import java.time.LocalDateTime;

@TopCommand
@Command(name = "main", mixinStandardHelpOptions = true)
public class MainCommand implements Runnable {
    

    @Inject
    NeedleConfig config;

    @Override
    public void run() {
        var version = config.version();
        var versionStr = String.format("%s.%s.%s", version.x(), version.y(), version.z());
        var cwd = System.getProperty("user.dir");
        var cwdPath = java.nio.file.Path.of(cwd);
        var basePath = config.basePath();
        var resolvedPath  = cwdPath.resolve(basePath);
        var pathIndicator = FileUtils.indicatorOfPath(resolvedPath);
        log().infof("Needle version[%s] started", versionStr);
        log().debugf("  Load Time: %s", Main.START_TIME.toString());
        log().debugf("  Working Dir: %s", cwd);
        log().infof("Path: cwd[%s] path[%s %s]", cwd,resolvedPath, pathIndicator);
    }
}
