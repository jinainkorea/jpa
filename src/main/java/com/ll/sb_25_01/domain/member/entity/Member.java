package com.ll.sb_25_01.domain.member.entity;
import com.ll.sb_25_01.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import static lombok.AccessLevel.PROTECTED;
@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Member extends BaseEntity {
    private String username;
    private String password;
}