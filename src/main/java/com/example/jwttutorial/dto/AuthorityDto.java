package com.example.jwttutorial.dto;


import com.example.jwttutorial.entity.UserRole;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityDto {
    private UserRole authorityName;
}