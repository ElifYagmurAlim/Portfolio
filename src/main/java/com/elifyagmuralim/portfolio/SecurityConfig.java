package com.elifyagmuralim.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // test için devre dışı
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/**").permitAll() // tüm /api yollarını aç
                        .anyRequest().permitAll() // her şeyi serbest bırak
                );
        return http.build();
    }
}