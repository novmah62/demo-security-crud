package com.novmah.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String phoneNumber;
    private String roles;

}
