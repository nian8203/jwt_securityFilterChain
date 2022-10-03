package com.jwtdemov2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jwtdemov2.service.impl.TokenService;

@RestController
public class AuthController {

	private Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping("/token")
	public String token(Authentication authentication) {
			logger.debug("Token requested for user: '{}'",authentication.getName());
			String token = tokenService.generateToken(authentication);
			logger.debug("Token granted {}",token);
			return token;
	}
}
