package com.example.eleven_backend.service;

import com.example.eleven_backend.entity.User;
import org.springframework.stereotype.Service;

public interface IndivisualService {
    User postUser(User user);

    User getUser(Integer userPkId);

    User deleteUser(Integer userPkId);

    User updateUserData(User user);
}
