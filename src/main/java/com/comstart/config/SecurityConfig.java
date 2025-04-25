package com.comstart.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;    
import org.springframework.context.annotation.Bean; 


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable())                    // CSRF 비활성화
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()                    // 모든 요청 허용
            )
            .formLogin(form -> form.disable())               // 로그인 화면 비활성화
            .httpBasic(basic -> basic.disable())             // HTTP Basic 비활성화 (옵션)
            .build();
    }
}