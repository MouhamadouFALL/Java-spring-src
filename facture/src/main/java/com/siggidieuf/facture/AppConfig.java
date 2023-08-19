package com.siggidieuf.facture;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.siggidieuf.facture.controller.web", "com.siggidieuf.facture.service.prefix", "com.siggidieuf.facture.repository.database"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
