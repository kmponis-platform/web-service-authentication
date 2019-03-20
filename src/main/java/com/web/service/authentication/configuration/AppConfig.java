package com.web.service.authentication.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig extends WebMvcConfigurerAdapter {

  @Value("${cross.origin.domain}")
  private String crossOriginDomain;

  /*
   * Additional options: .allowedMethods("POST", "GET", "PUT", "OPTIONS",
   * "DELETE").allowedHeaders("X-Auth-Token", "Content-Type").exposedHeaders("custom-header1",
   * "custom-header2").allowCredentials(false).maxAge(4800)
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedOrigins(crossOriginDomain);
  }
}
