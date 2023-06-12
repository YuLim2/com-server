package com.kingyu.com.domain.user.domain;

import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(name = "profile_cnt", nullable = false)
    private Integer cnt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Builder
    public User(String name, String email, String password, Integer cnt, Status status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cnt = cnt;
        this.status = status;
    }

}
