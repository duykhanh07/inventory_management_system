package com.khanh.services;

import com.khanh.dtos.LoginRequest;
import com.khanh.dtos.RegisterRequest;
import com.khanh.dtos.Response;
import com.khanh.dtos.UserDTO;
import com.khanh.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
