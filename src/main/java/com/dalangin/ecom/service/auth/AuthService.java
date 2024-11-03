package com.dalangin.ecom.service.auth;

import com.dalangin.ecom.dto.SignupRequest;
import com.dalangin.ecom.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
