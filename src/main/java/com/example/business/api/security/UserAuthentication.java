package com.example.business.api.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UserAuthentication implements  AuthenticationFacade {
    public Authentication getAuthentication() {
        return  SecurityContextHolder.getContext().getAuthentication();
    }
}
