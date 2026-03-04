package needle;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.time.LocalDateTime;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import jakarta.inject.Inject;
import picocli.CommandLine;

@QuarkusMain
public class Main implements QuarkusApplication {
    public static final LocalDateTime START_TIME = LocalDateTime.now();

    @Inject
    CommandLine.IFactory factory;

    @Inject
    @TopCommand
    MainCommand mainCommand;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        return new CommandLine(mainCommand, factory).execute(args);
    }
}
