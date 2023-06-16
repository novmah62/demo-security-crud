package com.novmah.service;

import com.novmah.dto.UserDto;

import java.util.List;

public interface UserService {


    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long id);

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);
}
