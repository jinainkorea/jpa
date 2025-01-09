package com.ll.sb_25_01.domain.member.entity;
import com.ll.sb_25_01.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;
@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@SuperBuilder
@Getter
@Setter
public class Member extends BaseEntity {
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String username;
    private String password;
}