package ru.vbalovnev.steam.formbuilder.assembly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.vbalovnev.steam.formbuilder.assembly.controller.GreetingController;

@Configuration
@ComponentScan(basePackageClasses = {
    GreetingController.class
})
public class AssemblyConfig {
}
