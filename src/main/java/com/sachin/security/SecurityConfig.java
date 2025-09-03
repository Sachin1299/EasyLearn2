package com.sachin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	CustomUserDetailsService udsi;
	

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationManager authenticationManager) throws Exception {
	    http.csrf(customizer -> customizer.disable())
	            .authorizeHttpRequests(auth -> auth
	            	.requestMatchers("/login", "/", "/home","/about","/contact", "/signup", "/CSS/**", "/js/**", "/Images/**", "/func.js","/loginmessage", "/loginmessage1")
					.permitAll().anyRequest().authenticated())
	            .formLogin(form -> form
	                    .loginPage("/")
	                    .usernameParameter("email")
	                    .passwordParameter("password")
	                    .loginProcessingUrl("/login")
	                    .defaultSuccessUrl("/home", true)
	                    .failureUrl("/?error=true")
	                    .permitAll())
	            .logout(logout -> logout
	                    .logoutUrl("/logout")
	                    .logoutSuccessUrl("/home") // Redirect to home after logout
	                    .permitAll());
	    
	    http.headers(customizer -> customizer.disable());
	    return http.build();
	}
	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationManager authenticationManager) throws Exception {
//		http.csrf(customizer -> customizer.disable())
//				.authorizeHttpRequests(auth -> auth
//						.requestMatchers("/login", "/", "/home", "/signup", "/css/**", "/js/**", "/Images/**")
//						.permitAll().anyRequest().authenticated())
//		   .addFilterBefore(authenticationFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class);
//		return http.build();
//	}

	@Bean
	public AuthenticationProvider authprovider() {

		DaoAuthenticationProvider dap = new DaoAuthenticationProvider();
		dap.setPasswordEncoder(new BCryptPasswordEncoder());
		dap.setUserDetailsService(udsi);
		return dap;
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {

		return config.getAuthenticationManager();
	}
//
//	@Bean
//	public UsernamePasswordAuthenticationFilter authenticationFilter(AuthenticationManager authenticationManager) {
//		System.out.println("in authenticationFilter");
//		CustomUsernamePasswordAuthenticationFilter filter = new CustomUsernamePasswordAuthenticationFilter(authenticationManager);
//		filter.setAuthenticationManager(authenticationManager);
//		return filter;
//	}
}
