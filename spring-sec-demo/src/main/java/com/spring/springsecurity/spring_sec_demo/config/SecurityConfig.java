package com.spring.springsecurity.spring_sec_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider() {

		// Dao Authentication Provider is used to help to connect with database to
		// retrieves user details
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return provider;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		// without lambda way.
//		Customizer<CsrfConfigurer<HttpSecurity>> customizer = new Customizer<CsrfConfigurer<HttpSecurity>>(){
//			@Override
//			public void customize(CsrfConfigurer<HttpSecurity> configurer) {
//				configurer.disable();
//			}
//		};

		// with lambda way
		http.csrf(csrf -> csrf.disable());
//		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		http.authorizeHttpRequests(request -> request.requestMatchers("/enroll/register").permitAll()
				.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}

//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user1 = User
//							.withDefaultPasswordEncoder()
//							.username("khush")
//							.password("1234")
//							.roles("USER")
//							.build();
//		UserDetails admin = User
//							.withDefaultPasswordEncoder()
//							.username("admin")
//							.password("admin@123")
//							.roles("ADMIN")
//							.authorities("SUPER_ADMIN")
//							.build();
//		return new InMemoryUserDetailsManager(user1, admin);
//	}
}
