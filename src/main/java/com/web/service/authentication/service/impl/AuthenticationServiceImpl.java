package com.web.service.authentication.service.impl;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.web.service.authentication.model.Token;
import com.web.service.authentication.model.User;
import com.web.service.authentication.repository.UserRepository;
import com.web.service.authentication.service.AuthenticationService;

@Component
@PropertySource({"classpath:application.properties"})
public class AuthenticationServiceImpl implements AuthenticationService {

  // private static Logger LOGGER = LogManager.getLogger(AuthenticationServiceImpl.class);

  @Autowired
  private UserRepository userRepository;

  @Value("${session.timeout}")
  private Long sessionTimeout;

  @Override
  public Token authentication(String username, String password) {

    User user = userRepository.findByUsernameAndPassword(username, password);
    if (null != user) {
      return Token.builder().userRole(user.getUserRole()).accessToken(UUID.randomUUID().toString())
          .sessionTimeOut(sessionTimeout).build();
    }
    return null;
  }

}
