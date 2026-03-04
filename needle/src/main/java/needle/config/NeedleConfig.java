package needle.config;

import java.nio.file.Path;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "needle")
public interface NeedleConfig {
     @WithDefault(".")
     Path basePath();

     VersionConfig version();
    
}
