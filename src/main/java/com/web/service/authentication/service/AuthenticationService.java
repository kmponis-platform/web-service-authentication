package com.web.service.authentication.service;

import com.web.service.authentication.model.Token;

public interface AuthenticationService {

  /**
   * Authentication for users.
   * 
   * @param username
   * @param password
   * @return Token
   */
  Token authentication(String username, String password);
}
