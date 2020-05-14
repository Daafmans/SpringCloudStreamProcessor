package com.example.demoprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class DemoprocessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoprocessorApplication.class, args);
    }

    @Bean
    public Function<Flux<Movie>, Flux<Movie>> function() {
        return flux -> flux.filter(movie -> movie.getRating() >= 3);
    }
}
