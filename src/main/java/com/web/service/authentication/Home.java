package com.web.service.authentication;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* @formatter:off
 * WAR packaging:
 * - Changes:
 * pom.xml - Use: <packaging>war</packaging>
 * pom.xml - Not Use: <artifactId>spring-boot-starter-actuator</artifactId>
 * Home.java - Use: code bellow
 * ApplicationInitializer.java - Use: class
 * - Access:
 * localhost:8080/web-service-file
 * - Swagger:
 * localhost:8080/web-service-file/swagger-ui.html
 */
//@Configuration
//@EnableWebMvc
//@ComponentScan
//public class Home {
//}

/* 
 * JAR packaging:
 * - Changes:
 * pom.xml - Use: <packaging>jar</packaging>
 * pom.xml - Use: <artifactId>spring-boot-starter-actuator</artifactId> 
 * Home.java - Use: bellow class
 * ApplicationInitializer.java - Not Use: class
 * - Access: 
 * localhost:8080
 * - Swagger:
 * localhost:8080/swagger-ui.html
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Home {
  public static void main(String[] args) {
    new SpringApplicationBuilder(Home.class).web(WebApplicationType.SERVLET).run(args);
  }
}
