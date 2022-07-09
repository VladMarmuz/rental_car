package com.example.rental_car.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;


@Getter
@AllArgsConstructor
public enum Role implements GrantedAuthority {
    ROLE_USER("user"),
    ROLE_ADMIN("admin");


    private String name;

    @Override
    public String getAuthority() {
        return name();
    }
}
