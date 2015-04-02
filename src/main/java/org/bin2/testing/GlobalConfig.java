package org.bin2.testing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages = {
        "org.bin2.testing.dao",
        "org.bin2.testing.service",
        "org.bin2.testing.websocket",
        "org.bin2.testing.signaling",
})
@ImportResource({
})
@Configuration
public class GlobalConfig extends WebMvcConfigurerAdapter {
}