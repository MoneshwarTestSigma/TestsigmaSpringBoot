package com.moneshwar.DTO.service;

import com.moneshwar.DTO.entity.User;
import com.moneshwar.DTO.repository.UserRepository;
import com.moneshwar.DTO.service.dto.UserGetDTO;
import com.moneshwar.DTO.service.mapper.MapStructMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public interface UserService {
    UserGetDTO getUserById(Long id);
    User saveUser(User user);
}
