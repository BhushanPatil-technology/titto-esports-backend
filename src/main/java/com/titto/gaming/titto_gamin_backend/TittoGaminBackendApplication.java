package com.titto.gaming.titto_gamin_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TittoGaminBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TittoGaminBackendApplication.class, args);
    }

    @Bean
public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**") // Applies to all API endpoints under "/api/"
                    .allowedOrigins("http://localhost:3000") // Set allowed frontend origin
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed HTTP methods
                    .allowCredentials(true); // Allows credentials (cookies, auth headers)
        }
    };
}

}
