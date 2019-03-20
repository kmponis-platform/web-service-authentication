package com.web.service.authentication.service.impl;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.web.service.authentication.model.Token;
import com.web.service.authentication.service.AuthenticationService;

@Component
@PropertySource("classpath:application.properties")
public class AuthenticationServiceImpl implements AuthenticationService {

  // private static Logger LOGGER = LogManager.getLogger(AuthenticationServiceImpl.class);

  @Value("${session.timeout}")
  private Long sessionTimeout;

  @Override
  public Token authentication(String username, String password) {
    if ("user".equals(username)) {
      return Token.builder().accessToken(UUID.randomUUID().toString())
          .sessionTimeOut(sessionTimeout).build();
    }
    return null;
  }

}
