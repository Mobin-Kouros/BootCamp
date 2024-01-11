package com.example.bootcamp.entity;

import com.example.bootcamp.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
//    @NotBlank(message = "name can not bo blank/empty")
    private String name;

    @Column(name = "last_name")
//    @NotBlank(message = "last_name can not bo blank/empty")
    private String lastName;

    @Column(name = "birth_date")
//    @NotBlank(message = "birth_date can not bo blank/empty")
    private String birthDate;

    @Version
    private Long version;

    @CreationTimestamp
    private LocalDateTime createDate;


    public static MemberDto convert(Member entity){
        return MemberDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .lastName(entity.getLastName())
                .birthDate(entity.getBirthDate())
                .build();
    }

}
