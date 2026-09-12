package com.example.eleven_backend.serviceImplementation;

import com.example.eleven_backend.entity.User;
import com.example.eleven_backend.repository.UserRepo;
import com.example.eleven_backend.service.IndivisualService;
import org.springframework.stereotype.Service;

@Service
public class IndivisualServiceImpl implements IndivisualService {

    private final UserRepo userRepo;

    public IndivisualServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public User postUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(Integer userPkId) {
        if(userPkId != null){
            userRepo.findById(userPkId);
        }
    }

    @Override
    public User deleteUser(Integer userPkId) {
        return null;
    }

    @Override
    public User updateUserData(User user) {
        return null;
    }
}
