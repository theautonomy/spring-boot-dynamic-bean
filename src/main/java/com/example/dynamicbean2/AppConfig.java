package com.example.dynamicbean2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyBeanRegistrar.class)
public class AppConfig {
    // No additional code needed here
}
