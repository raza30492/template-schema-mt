package com.jazasoft.mt.service;

import com.jazasoft.mt.entity.User;
import com.jazasoft.mt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mdzahidraza on 26/06/17.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findOne(Long id){
        return userRepository.findOne(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User save(User user) {
        user.setPassword(user.getMobile());
        return userRepository.save(user);
    }
}
