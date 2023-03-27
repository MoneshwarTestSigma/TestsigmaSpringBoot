package com.moneshwar.DTO.service.mapper;

import com.moneshwar.DTO.entity.User;
import com.moneshwar.DTO.service.dto.UserGetDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-27T13:26:35+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public UserGetDTO userToUserGetDRO(User user) {
        if ( user == null ) {
            return null;
        }

        UserGetDTO userGetDTO = new UserGetDTO();

        userGetDTO.setId( user.getId() );
        userGetDTO.setName( user.getName() );
        userGetDTO.setAbout( user.getAbout() );

        return userGetDTO;
    }
}
