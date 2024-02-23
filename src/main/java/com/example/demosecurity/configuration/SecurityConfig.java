package com.example.demosecurity.configuration;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    UserDetailsService userDetailsService() {
        Collection<UserDetails> users = new ArrayList<>();
        UserDetails details = User.withDefaultPasswordEncoder().username("shreya").password("pass1").roles("ADMIN").build();
        users.add(details);
        UserDetails details1 = User.withDefaultPasswordEncoder().username("talentsprint").password("ts").roles("User").build();
        users.add(details1);
        return new InMemoryUserDetailsManager(users);
    }
}
