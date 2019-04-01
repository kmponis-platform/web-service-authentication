package com.web.service.authentication.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User entity to bind with MongoDB - Used by UserRepository.java
 */
@Data
@AllArgsConstructor
public class User {

  private String username;

  private String password;

  private String userRole;
}
