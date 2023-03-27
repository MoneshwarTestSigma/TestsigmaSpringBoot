package com.moneshwar.DTO.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGetDTO {
    private long id;
    private String name;
    private String about;
}
