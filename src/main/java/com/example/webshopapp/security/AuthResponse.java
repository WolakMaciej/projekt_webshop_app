package com.example.webshopapp.security;


import com.example.webshopapp.model.UserAuthority;
import lombok.Data;

@Data
public class AuthResponse {
    private String authToken;
    private UserAuthority authority;

    public AuthResponse(String authToken, UserAuthority authority) {
        this.authToken = authToken;
        this.authority = authority;
    }


}
