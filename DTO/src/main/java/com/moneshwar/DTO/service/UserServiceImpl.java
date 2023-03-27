package com.moneshwar.DTO.service;

import com.moneshwar.DTO.entity.User;
import com.moneshwar.DTO.repository.UserRepository;
import com.moneshwar.DTO.service.dto.UserGetDTO;
import com.moneshwar.DTO.service.mapper.MapStructMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Data
@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    MapStructMapper mapStructMapper;
    @Autowired

    public UserServiceImpl(UserRepository userRepository, MapStructMapper mapStructMapper) {
        this.userRepository = userRepository;
        this.mapStructMapper = mapStructMapper;
    }

    @Override
    public UserGetDTO getUserById(Long id) {
        return mapStructMapper.userToUserGetDRO(userRepository.getById(id));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
