package com.dalangin.ecom.dto;

import com.dalangin.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String email;
    private String name;
    private UserRole userRole;
}
