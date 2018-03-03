package ru.vbalovnev.steam.formbuilder.assembly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.vbalovnev.steam.formbuilder.assembly.config.AssemblyConfig;
import ru.vbalovnev.steam.formbuilder.service.config.ServiceConfig;

@SpringBootApplication
@Import({
    AssemblyConfig.class,
    ServiceConfig.class
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
