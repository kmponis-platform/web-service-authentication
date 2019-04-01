package com.web.service.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.web.service.authentication.model.Token;
import com.web.service.authentication.service.AuthenticationService;
import io.swagger.annotations.ApiOperation;

@RestController
public class AuthenticationController {

  @Autowired
  private AuthenticationService authenticationService;

  @ApiOperation(value = "Return token if authenticated", response = Token.class)
  @GetMapping(value = "/authentication")
  public Token authentication(@RequestParam(value = "username") String username,
      @RequestParam(value = "password") String password) {

    // String logTimesComponent = "AuthenticationController().authentication(username, password)";
    // LogTimes.startTiming(logTimesComponent);
    // Token authentication = authenticationService.authentication(username, password);
    // LogTimes.endTiming(logTimesComponent, "info");
    // return authentication;
    return authenticationService.authentication(username, password);
  }

}
