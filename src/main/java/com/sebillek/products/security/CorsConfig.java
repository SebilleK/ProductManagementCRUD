package com.sebillek.products.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer (){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings (CorsRegistry registry) {
                WebMvcConfigurer.super.addCorsMappings(registry); {
                    registry.addMapping("/**") //Enabling CORS for the whole App
                            .allowedOrigins("http://localhost:5173") // Change port as/if needed for Frontend...
                            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                            .allowedHeaders("*");
                }
            }
        };
    }
}
