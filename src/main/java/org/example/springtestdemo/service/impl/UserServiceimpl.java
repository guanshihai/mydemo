package org.example.springtestdemo.service.impl;

import org.example.springtestdemo.dto.UserDTO;
import org.example.springtestdemo.entity.User;
import org.example.springtestdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserDTO> listAllUsers() {
        return List.of();
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(Long id) {
        return false;
    }
}
