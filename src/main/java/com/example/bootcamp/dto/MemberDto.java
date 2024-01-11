package com.example.bootcamp.dto;

import com.example.bootcamp.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemberDto {

    private Long id;
    private String name;
    private String lastName;
    private String birthDate;

    public static Member convert(MemberDto dto){
        return Member.builder()
                .id(dto.getId())
                .name(dto.getName())
                .lastName(dto.getLastName())
                .birthDate(dto.getBirthDate())
                .build();
    }
}
