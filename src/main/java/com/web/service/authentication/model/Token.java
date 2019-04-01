package com.web.service.authentication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Token entity to return JSON file from Controller
 */
@Data
@AllArgsConstructor
@Builder
public class Token {

  public Token() {
    // Throwing: Cannot construct instance of `com.web.service.authentication.model.Token`
  }

  private String userRole;

  private String accessToken;

  private long sessionTimeOut;
}
