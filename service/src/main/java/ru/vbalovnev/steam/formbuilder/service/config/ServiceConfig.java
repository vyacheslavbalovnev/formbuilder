package ru.vbalovnev.steam.formbuilder.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.vbalovnev.steam.formbuilder.service.imp.DataServiceImpl;

@Configuration
@ComponentScan(basePackageClasses = {
    DataServiceImpl.class,
})
public class ServiceConfig {
}
