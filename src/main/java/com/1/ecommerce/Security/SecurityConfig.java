package com.grupo1.esenciasspring.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((requests -> requests
                        .requestMatchers("", "/Inventario/**", "Producto/**","Usuario/**").hasAuthority("ADMIN")
                        .anyRequest().permitAll()))
                .formLogin(login -> login
                .loginPage("/login")
                .defaultSuccessUrl("/hello"))
                .logout(logout -> logout
                        .permitAll());
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("OscarAravena")
                        .password("Llaima_oncedeJulio")
                        .roles("ADMIN")
                        .build();
        return new InMemoryUserDetailsManager(user);

    }
}
