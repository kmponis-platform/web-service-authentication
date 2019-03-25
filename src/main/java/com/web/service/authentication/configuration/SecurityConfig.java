package com.web.service.authentication.configuration;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:security.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private static final String USER_ROLE = "USER";

  @Value("${cross.origin.domain}")
  private String crossOriginDomain;

  @Value("${user.role.username}")
  private String userRoleUsername;

  @Value("${user.role.password}")
  private String userRolePassword;

  /*
   * Assign Username and Password to User-Role. Not needed until 'Assign User-Role to Mappings' is
   * done
   */
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .passwordEncoder(
            org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance())
        .withUser(userRoleUsername).password(userRolePassword).roles(USER_ROLE);
  }

  /*
   * Add Cross Origin Domain
   * 
   * TODO: Assign User-Role to Mappings:
   * .and().httpBasic().and().authorizeRequests().antMatchers("/**").hasRole(USER_ROLE)
   * .and().csrf().disable().headers().frameOptions().disable()
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors();
  }

  @Bean
  CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Arrays.asList(crossOriginDomain));
    configuration.setAllowedMethods(Arrays.asList("GET", "POST"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
  }

}
