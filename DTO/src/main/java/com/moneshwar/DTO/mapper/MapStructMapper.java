package com.moneshwar.DTO.service.mapper;

import com.moneshwar.DTO.entity.User;
import com.moneshwar.DTO.service.dto.UserGetDTO;
import org.mapstruct.Mapper;

@Mapper(
    componentModel = "spring"
)
public  interface MapStructMapper {
    UserGetDTO userToUserGetDRO(User user);
}
