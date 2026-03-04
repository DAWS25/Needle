package needle.config;

import java.nio.file.Path;
import java.util.Optional;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "needle")
public interface NeedleConfig {
     @WithDefault(".")
     Path basePath();

     Optional<String> pathSelector();

     @WithDefault("deploy")
     String goal();

     VersionConfig version();    
}
