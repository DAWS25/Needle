package needle.config;

import io.smallrye.config.WithDefault;

public interface VersionConfig {
    @WithDefault("0")
    String x();

    @WithDefault("0")
    String y();

    @WithDefault("0")
    String z();
}
